package com.ecs160.hw1;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import com.google.gson.*;


public class SocialMediaAnalyzerDriver {

    private List<Post> parseJson(String filePath) throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(new FileReader(filePath));
        List<Post> posts = new ArrayList<>();

        if (element.isJsonObject()) {
            JsonObject jsonObject = element.getAsJsonObject();
            JsonArray feedArray = jsonObject.getAsJsonArray("feed");

            for (JsonElement feedObject : feedArray) {
                JsonObject thread = feedObject.getAsJsonObject().getAsJsonObject("thread");
                posts.add(parseThread(thread));
            }
        }
        return posts;
    }

    private Post parseThread(JsonObject thread) {

    }
    public static void main(String[] args) throws IOException {
        long x = 0;
        try {
            // Get File (Not done) 
            File jsonInput = new File("input");
            x = jsonInput.length();
            if (jsonInput.createNewFile()) {
                System.out.println("File created: " + jsonInput.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            System.out.println(x);
        }
    }
}
