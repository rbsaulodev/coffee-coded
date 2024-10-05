package rb.Controller;

import org.springframework.web.bind.annotation.*;
import rb.Domain.Anime;  // Importar a classe Anime

import java.util.List;

@RestController
@RequestMapping(value = "v1/animes")
public class AnimeController {

    @GetMapping
    public List<Anime> listAll(@RequestParam(required = false) String name) {
        var animes = Anime.getAll();
        if(name == null) return animes;
        return animes.stream().filter(anime -> anime.getName().equalsIgnoreCase(name)).toList();
    }

    @GetMapping("{id}")
    public List<Anime> listById(@PathVariable long id) {
        return Anime.getAll().stream()
                .filter(anime -> anime.getId() == id)
                .findFirst()
                .map(List::of)
                .orElse(List.of());
    }
}
