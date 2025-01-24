package com.ecs160.hw1;


public class Thread {
    private Post post;
    private Replies replies;

    // Constructor
    public Thread(Post post) {
        this.post = post;
        this.replies = null;
    }

    // Getters and Setters
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Replies getReplies() {
        return replies;
    }

    public void setReplies(Replies replies) {
        this.replies = replies;
    }
}
