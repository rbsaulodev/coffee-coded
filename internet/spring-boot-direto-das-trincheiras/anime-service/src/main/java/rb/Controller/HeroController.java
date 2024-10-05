package rb.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/heroes")
public class HeroController {
    private static final List<String> heroes = List.of("Guts", "Ichigo", "Luffy", "Goku");

    @GetMapping
    public List<String> listAllHeroes(){
        return  heroes;
    }

    @GetMapping("filter")
    public List<String> listHeroesByName(@RequestParam(required = false) String name){
        return heroes.stream().filter(hero -> hero.equalsIgnoreCase(name)).toList();
    }

    @GetMapping("filterList")
    public List<String> listHeroesByNames(@RequestParam(required = false) List<String> names){
        return heroes.stream().filter(names::contains).toList();
    }

    @GetMapping("{name}")
    public ResponseEntity<String> findByName(@PathVariable String name){
        String hero = heroes
                .stream()
                .filter(h -> h.equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);

        if (hero == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hero not found");
        }

        return ResponseEntity.ok(hero);
    }
}
