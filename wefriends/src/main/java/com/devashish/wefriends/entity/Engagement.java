package com.devashish.wefriends.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Engagement {
    String name;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;
    String city;
    List<String> tags = new ArrayList<String>();
    @ManyToMany(mappedBy = "engagements")
    List<Users> members = new ArrayList<Users>();

}
