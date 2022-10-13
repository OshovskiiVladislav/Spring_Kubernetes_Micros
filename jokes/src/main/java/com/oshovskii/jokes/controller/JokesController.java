package com.oshovskii.jokes.controller;

import com.oshovskii.jokes.client.ChuckNorrisJokesClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/jokes")
@RequiredArgsConstructor
public class JokesController {
    private final ChuckNorrisJokesClient client;

    @GetMapping("/random")
    public Map<String, String> getRandomJoke() {
        return Map.of("joke", client.getRandomJoke());
    }
}
