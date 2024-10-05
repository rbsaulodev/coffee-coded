package rb.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Anime {
    long id;
    String name;

    public static List<Anime> getAll() {
        return List.of(
                new Anime(1, "Naruto"),
                new Anime(2, "Bleach"),
                new Anime(3, "One Piece"),
                new Anime(4, "Fire Force"),
                new Anime(5, "Hunter X Hunter")
        );
    }
}
