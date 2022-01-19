package com.xhnya.blog.po;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xhn
 * @data 2020/11/15 - 10:56
 */
@Entity
@Table(name = "t_tag")
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String tagName;

    @ManyToMany(mappedBy = "tags", fetch = FetchType.EAGER)
    private List<Blog> blogs = new ArrayList<>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public Tag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", tagName='" + tagName + '\'' +
                '}';
    }
}