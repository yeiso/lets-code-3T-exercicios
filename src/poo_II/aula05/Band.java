package poo_II.aula05;

import java.util.List;

public class Band {

    private String name;
    private List<MusicGenre> genres;

    public Band(String name, List<MusicGenre> genres) {
        this.name = name;
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public List<MusicGenre> getGenres() {
        return genres;
    }

    public void addGenre(MusicGenre musicGenre){
        this.genres.add(musicGenre);
    }
}
