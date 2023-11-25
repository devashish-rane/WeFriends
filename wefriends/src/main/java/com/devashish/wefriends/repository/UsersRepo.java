package com.devashish.wefriends.repository;

import com.devashish.wefriends.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepo extends CrudRepository<Users, Long> {
    public List<Users> findAll();
}
