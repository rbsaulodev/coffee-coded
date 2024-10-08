package rb.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Anime {
    private long id;
    private String name;
    @Getter
    private static List<Anime> animes = new ArrayList<>();
    static {
       var anime1 = new Anime(1, "Naruto");
       var anime2 = new Anime(2, "Bleach");
       var anime3 = new Anime(3, "One Piece");
       var anime4 = new Anime(4, "Fire Force");
       var anime5 = new Anime(5, "Hunter X Hunter");

       animes.addAll(List.of(anime1, anime2, anime3, anime4, anime5));
    }

}
