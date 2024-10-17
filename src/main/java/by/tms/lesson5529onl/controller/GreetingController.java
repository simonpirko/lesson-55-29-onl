package by.tms.lesson5529onl.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author simonpirko
 * Created on 17.10.24
 */

@Controller
@RequestMapping("/")
public class GreetingController {

    @GetMapping
    public String greeting() {
        return "greeting";
    }
}
