package com.ecs160.hw1;


import java.util.ArrayList;


public class feed<T> {
    protected ArrayList<T> threads = new ArrayList<T>();

    public feed(T thread){
        threads.add(thread);
    }
}
