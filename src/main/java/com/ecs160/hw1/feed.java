package com.ecs160.hw1;


public class Feed {
    private Thread thread;

    // Constructor
    public Feed(Thread thread) {
        this.thread = thread;
    }

    // Getters and Setters
    public Thread getThread() {

        return thread;
    }

    public void setThread(Thread thread) {

        this.thread = thread;
    }
}
