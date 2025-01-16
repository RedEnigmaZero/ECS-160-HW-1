package com.ecs160.hw1;

import java.util.List;

public class Post {
    private String uri;
    private String cid;
    private Author author;
    private Record record;
    private int replyCount;
    private int repostCount;
    private int likeCount;
    private int quoteCount;
    private String indexedAt;
    private Viewer viewer;
    private List<String> labels;

    public Post() {
        this.uri = "empty";
    }

    // Getters and Setters
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getCid() {
        return cid;
    }
}
