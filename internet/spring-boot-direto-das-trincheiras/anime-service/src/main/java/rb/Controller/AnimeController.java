package rb.Controller;

import org.springframework.web.bind.annotation.*;
import rb.Domain.Anime;  // Importar a classe Anime

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping(value = "v1/animes")
public class AnimeController {

    @GetMapping
    public List<Anime> listAll(@RequestParam(required = false) String name) {
        var animes = Anime.getAnimes();
        if(name == null) return animes;
        return animes.stream().filter(anime -> anime.getName().equalsIgnoreCase(name)).toList();
    }

    @GetMapping("{id}")
    public List<Anime> listById(@PathVariable long id) {
        return Anime.getAnimes().stream()
                .filter(anime -> anime.getId() == id)
                .findFirst()
                .map(List::of)
                .orElse(List.of());
    }

    @PostMapping()
    public Anime saveAnime(@RequestBody Anime anime){
        anime.setId(ThreadLocalRandom.current().nextLong(100_000));
        Anime.getAnimes().add(anime);
        return anime;
    }
}
