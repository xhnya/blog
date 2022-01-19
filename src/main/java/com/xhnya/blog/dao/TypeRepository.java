package com.xhnya.blog.dao;

import com.xhnya.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author xhn
 * @data 2020/11/17 - 20:12
 */
public interface TypeRepository extends JpaRepository<Type, Long> {


    Type findByName(String name);

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
