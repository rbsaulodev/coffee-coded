package rb.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/greetins")
public class HelloController {

    @GetMapping()
    public String retonar() {
        return "Hello World!";
    }

    @PostMapping
    public String save (@RequestBody String name){
        return name;
    }
}
