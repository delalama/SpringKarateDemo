package com.delalama.SpringKarate.Controller;

import com.delalama.SpringKarate.Modelç.Name;
import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "greeting", produces= MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> postGreeting(
            @RequestBody String name ) {
        Gson gson = new Gson();
        Name name1 = gson.fromJson(name, Name.class);

        HashMap<String, String> map = new HashMap<>();
        map.put("greeting", "hello " + name1.getName() );

        return map;
    }
}
