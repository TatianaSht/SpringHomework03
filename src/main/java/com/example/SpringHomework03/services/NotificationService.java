package com.example.SpringHomework03.services;

import com.example.SpringHomework03.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {


    public void notifyUser(User user){
        System.out.println("A new user been created: " + user.getName());
    }


    public void addUserToRepository(User user){
        System.out.println("A new user been added to repository: " + user.getName());
    }
}
