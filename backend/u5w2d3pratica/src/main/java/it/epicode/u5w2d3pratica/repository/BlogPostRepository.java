package it.epicode.u5w2d3pratica.repository;

import it.epicode.u5w2d3pratica.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {
}
