package com.devashish.wefriends.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Users {
        String name;
        String id;
        @Id
        List<String> hobbies = new ArrayList<String>();
        String email;
        String password;
        String city;
        @ManyToMany
        List<Engagement> engagements = new ArrayList<Engagement>();
}
