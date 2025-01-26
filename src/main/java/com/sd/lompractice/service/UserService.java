package com.sd.lompractice.service;

import com.sd.lompractice.model.User;
import com.sd.lompractice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

@Autowired
UserRepo repo;

   public User save(User user){
       repo.save(user);
       return user;
   }

}

