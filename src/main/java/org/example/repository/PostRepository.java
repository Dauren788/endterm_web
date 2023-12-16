package org.example.repository;

import org.example.model.PostFeed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostFeed, Long> {
}

