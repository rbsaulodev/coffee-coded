package rb.usermanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "Seja Bem-Vindo ao Desafio de Padrões de Projeto dado pela DIO!!!";
    }
}
