package com.example.random_phrase_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class TestController {

    @GetMapping("/test")
    public String text() {
        return selectMessage();
    }

    public String selectMessage() {

        ArrayList<String> arrayOfMessages = new ArrayList<>();
        arrayOfMessages.add("Message 1");
        arrayOfMessages.add("Message 2");
        arrayOfMessages.add("Message 3");

        Random rn = new Random();
        int chosenNumber = rn.nextInt(3);
        String message = arrayOfMessages.get(chosenNumber);

        return message;

    }

}


