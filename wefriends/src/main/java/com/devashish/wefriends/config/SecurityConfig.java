package com.devashish.wefriends.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        //line 16 and 17 for H2DB page wasn't loading
        http.csrf(csrf -> csrf.disable())
                .headers(header -> header.frameOptions(fo -> fo.disable()))
                .authorizeHttpRequests((auth) ->
                        auth.requestMatchers(AntPathRequestMatcher.antMatcher("/home")).permitAll()
                                .anyRequest().authenticated())
                .formLogin(form -> form.defaultSuccessUrl("/account").permitAll())
                .logout(logout -> logout.logoutUrl("/logout").permitAll());


        return http.build();
    }
}
