package com.delalama.SpringKarate.feature;

import com.intuit.karate.junit5.Karate;

class greetingRunner {
    @Karate.Test
    Karate testGreeting() {
        return Karate.run("greeting").relativeTo(getClass());
    }
}