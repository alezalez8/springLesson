package com.example.springLesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//https://www.youtube.com/watch?v=LOmcsf5IylI&list=PLU2ftbIeotGqSTOVNjT4L3Yfy8jatCdhm

@RestController
@RequestMapping("message")
public class MessageController {

    List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {{
        add(new HashMap<String, String>(){{put("id", "1"); put("text", "First message");}});
        add(new HashMap<String, String>(){{put("id", "2"); put("text", "Second message");}});
        add(new HashMap<String, String>(){{put("id", "3"); put("text", "Third message");}});

    }};

    @GetMapping("1")
    public List<Map<String, String>> list(){
        return messages;
    }

    @GetMapping("2")
    public String list2(){
        return "index2";
    }
}
