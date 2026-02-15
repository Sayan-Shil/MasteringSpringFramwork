package com.app.spring.abstraction.proxies;

import com.app.spring.abstraction.entity.Comment;

public interface NotificationProxy {
    void notifyComment(Comment comment);
}
