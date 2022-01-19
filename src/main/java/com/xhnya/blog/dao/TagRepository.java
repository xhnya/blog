package com.xhnya.blog.dao;

import com.xhnya.blog.po.Tag;
import com.xhnya.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;


public interface TagRepository extends JpaRepository<Tag, Long>{
    Tag findByTagName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
