package com.org.example.springboot.web.dto;

import com.org.example.springboot.domain.posts.Posts;
import com.org.example.springboot.domain.posts.PostsRepository;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String  content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.content=entity.getContent();
        this.author=entity.getAuthor();
    }
}
