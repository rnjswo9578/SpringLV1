package com.springlv1.blog.post.repository;

import com.springlv1.blog.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

}
