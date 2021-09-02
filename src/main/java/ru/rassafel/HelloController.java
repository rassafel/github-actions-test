package ru.rassafel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rassafel
 */
@RestController
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}
