package com.app.spring.springcontext.abstraction.proxies;

import com.app.spring.springcontext.abstraction.entity.Comment;

public interface NotificationProxy {
    void notifyComment(Comment comment);
}
