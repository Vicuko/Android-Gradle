package com.example.jokewizard;

import com.example.jokesmith.JokeSmith;

public class JokeWizard {
    public String getJoke(){
        JokeSmith joke = new JokeSmith();
        return joke.getJoke();
    }
}
