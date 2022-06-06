package poo_II.aula05;

import java.util.List;

public class Movie extends Item{

    private Studio studio;
    protected List<People> Directors;
    protected List<People> Producers;
    protected List<MovieGenre> genres;

    public Movie(int id, String name, double price, Studio studio, List<People> directors, List<People> producers, List<MovieGenre> genres) {
        super(id, name, price);
        this.studio = studio;
        Directors = directors;
        Producers = producers;
        this.genres = genres;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public List<People> getDirectors() {
        return Directors;
    }

    public void setDirectors(List<People> directors) {
        Directors = directors;
    }

    public List<People> getProducers() {
        return Producers;
    }

    public void setProducers(List<People> producers) {
        Producers = producers;
    }

    public List<MovieGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<MovieGenre> genres) {
        this.genres = genres;
    }
}
