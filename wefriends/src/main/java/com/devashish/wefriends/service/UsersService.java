package com.devashish.wefriends.service;

import com.devashish.wefriends.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    UsersRepo usersRepo;



}
