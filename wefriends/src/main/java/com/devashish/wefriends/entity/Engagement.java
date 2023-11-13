package com.devashish.wefriends.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Engagement {
    String name;
    @Id
    String id;
    String city;
    List<String> tags = new ArrayList<String>();
    @ManyToMany(mappedBy = "engagements")
    List<Users> members = new ArrayList<Users>();

}
