package com.ecs160.hw1;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.io.File;


public class SocialMediaAnalyzerDriver {
    public static void main(String[] args) throws IOException {
        try {
            File jsonInput = new File("input");
            if (jsonInput.createNewFile()) {
                System.out.println("File created: " + jsonInput.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
