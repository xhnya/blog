package com.xhnya.blog.service;

import com.xhnya.blog.po.Comment;

import java.util.List;

/**
 * @author xhn
 * @data 2020/11/22 - 20:26
 */

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
