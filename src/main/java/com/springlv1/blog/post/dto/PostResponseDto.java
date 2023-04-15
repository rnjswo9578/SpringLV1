package com.springlv1.blog.post.dto;


import com.springlv1.blog.post.entity.Post;
import lombok.Getter;

@Getter
public class PostResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String password;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.author = post.getAuthor();
        this.content = post.getContent();
        this.password = post.getPassword();
    }

}
