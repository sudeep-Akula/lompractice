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

//       User user1 = new User();
//       user1.setName(userdto.getName());
//       user1.setEmail(userdto.getEmail());
//       user1.setMobile(userdto.getMobile());
//       user1.setPassword(userdto.getPassword());
       repo.save(user);
       return user;
   }

}

