package com.nekit.webapp.repo;

import com.nekit.webapp.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
