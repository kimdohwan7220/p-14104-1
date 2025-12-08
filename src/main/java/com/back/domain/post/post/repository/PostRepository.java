package com.back.domain.post.post.repository;

import com.back.domain.post.post.entity.Post;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
    Optional<Post> findFirstByOrderByIdDesc();
}