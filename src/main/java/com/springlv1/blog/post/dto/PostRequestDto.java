package com.springlv1.blog.post.dto;

import lombok.Getter;

@Getter
public class PostRequestDto {
    private String title;
    private String content;
    private String author;
    private String password;

}
