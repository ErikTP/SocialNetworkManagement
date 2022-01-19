package com.example.socialnetworkmanagement.Service;

import com.example.socialnetworkmanagement.Entity.Post;
import com.example.socialnetworkmanagement.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public void savePost(Post post) {
        postRepository.save(post);
    }

    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }

    public List<Post> findPostsByCreatedDate() {
        return postRepository.findAllByOrderByCreatedDateDesc();
    }

    public List<Post> findPostByAuthorId(long id) {
        return postRepository.findByAuthorId(id);
    }

    public List<Post> findPostByAuthorIdCreatedDate(long id) {
        return postRepository.findAllByAuthorIdOrderByCreatedDateDesc(id);
    }

    public void deletePost(long id) {
        postRepository.deleteById(id);
    }

    public void deletePostsByAuthorId(long id) {
        postRepository.deleteAllByAuthorId(id);
    }

}

