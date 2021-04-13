package com.example.MP06UF6Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller //
@RequestMapping(GreetingController.GREETING)
public class GreetingController {
    public static final String GREETING = "/greeting";

    @GetMapping
    public String greeting(@RequestParam(value = "name",required=false , defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
