package com.delalama.SpringKarate.Controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @GetMapping(path = "greeting", produces= MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getGreeting() {
        HashMap<String, String> map = new HashMap<>();
        map.put("greeting", "hello Sir");
        return map;
    }
}
