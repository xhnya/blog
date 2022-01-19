package com.xhnya.blog.dao;

import com.xhnya.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xhn
 * @data 2020/11/22 - 20:31
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);

}
