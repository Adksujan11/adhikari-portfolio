package com.sujan.AdhikariSujan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "redirect:/resume.pdf"; // Resume linked to About button
    }

    @GetMapping("/experience")
    public String experience() {
        return "experience"; // You can create experience.html if needed
    }

    @GetMapping("/project")
    public String project() {
        return "project"; // Optional: Create project.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Optional: Create contact.html
    }
}
