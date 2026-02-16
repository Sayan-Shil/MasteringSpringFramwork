package com.app.spring.springcontext.abstraction.repositories;

import com.app.spring.springcontext.abstraction.entity.Comment;
import org.springframework.stereotype.Repository;

//@Component --> Instead of this , a better name
@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void saveComment(Comment comment) {
        System.out.println("Comment Saved in Database ");
    }
}
