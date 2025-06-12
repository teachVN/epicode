package it.epicode.u5w2d4pratica.repository;

import it.epicode.u5w2d4pratica.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {
}
