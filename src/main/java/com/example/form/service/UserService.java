package com.example.form.service;

import com.example.form.models.User;

import com.example.form.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    FormRepository formRepository;

    public User saveUser(User userRequest){
        User user = new User();
        user.setName(userRequest.getName());
        user.setAge(userRequest.getAge());
        user.setAddress(userRequest.getAddress());


        return formRepository.save(user);
    }
}
