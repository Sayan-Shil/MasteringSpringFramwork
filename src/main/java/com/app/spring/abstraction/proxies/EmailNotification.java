package com.app.spring.abstraction.proxies;

import com.app.spring.abstraction.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements NotificationProxy {
    @Override
    public void notifyComment(Comment comment) {
        System.out.println("Comment Notified Via Email Notification");
    }
}
