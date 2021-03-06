package com.example.socialnetworkmanagement.Repository;

import com.example.socialnetworkmanagement.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByAuthorId(long id);

    List<Post> findAllByAuthorIdOrderByCreatedDateDesc(long id);

    List<Post> findAllByOrderByCreatedDateDesc();

    @Transactional
    void deleteAllByAuthorId(long id);
}