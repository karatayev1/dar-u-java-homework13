package kz.dar.university3.greetingservice3.controller;

import kz.dar.university3.greetingservice3.domain.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingController {
    private static final String TEMPLATE = "Hello, %s!";
    @GetMapping("/greeting")
    public Greeting getGreeting(@RequestParam(required = false, defaultValue = "World") String name) {
        log.info("Name: " + name);
        return new Greeting(String.format(TEMPLATE, name));
    }
}
