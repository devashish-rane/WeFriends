package com.devashish.wefriends.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Users {
        String name;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Long id;
        List<String> hobbies = new ArrayList<String>();
        String email;
        String password;
        String city;
        @ManyToMany
        List<Engagement> engagements = new ArrayList<Engagement>();
}
