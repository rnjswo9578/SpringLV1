package com.springlv1.blog.post.entity;

import com.springlv1.blog.post.dto.PostRequestDto;
import com.springlv1.blog.post.repository.PostRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Post extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String author;
    private String password;

    public Post(PostRequestDto postRequestDto) {
        this.title = postRequestDto.getTitle();
        this.content = postRequestDto.getContent();
        this.author = postRequestDto.getAuthor();
        this.password = postRequestDto.getPassword();
    }

    public void update(PostRequestDto postRequestDto) {
        this.content = postRequestDto.getContent();
        this.title = postRequestDto.getTitle();
        this.author = postRequestDto.getAuthor();
    }
}
