package com.app.spring.springaop.withAspect;


import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserService {
    private Logger logger = Logger.getLogger(UserService.class.getName());
    public void publishComment(Comment comment) {
        logger.info("Published Comment : " + comment.getComment());
    }
}
