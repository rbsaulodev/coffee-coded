package rb.my_first_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping
    public String WelcomeString(){
        return "Olá Mundo, foco e fé!";
    }
}
