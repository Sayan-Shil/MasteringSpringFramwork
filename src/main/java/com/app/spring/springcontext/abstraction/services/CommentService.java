package com.app.spring.springcontext.abstraction.services;


import com.app.spring.springcontext.abstraction.entity.Comment;
import com.app.spring.springcontext.abstraction.proxies.NotificationProxy;
import com.app.spring.springcontext.abstraction.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component Instead Of this a better name
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final NotificationProxy notificationProxy;

    @Autowired
    public CommentService(@Qualifier("file") CommentRepository commentRepository, NotificationProxy notificationProxy) {
        this.commentRepository = commentRepository;
        this.notificationProxy = notificationProxy;
    }

    public void addComment(Comment comment) {
        commentRepository.saveComment(comment);
        notificationProxy.notifyComment(comment);
    }
    


}
