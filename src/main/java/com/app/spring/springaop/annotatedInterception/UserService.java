package com.app.spring.springaop.annotatedInterception;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserService {

    @ToLog
    public void sayUserName(User user){
        System.out.println(user.getName());
    }
}
