package poo_II.aula05;

import java.util.List;

public class Movie extends Item{

    private Studio studio;
    protected List<People> directors;
    protected List<People> producers;
    protected List<MovieGenre> genres;

    public Movie(int id, String name, double price, Studio studio, List<People> directors, List<People> producers, List<MovieGenre> genres) {
        super(id, name, price);
        this.studio = studio;
        this.directors = directors;
        this.producers = producers;
        this.genres = genres;
    }

    protected void updateMovie(String name, double price, Studio studio, List<People> directors, List<People> producers, List<MovieGenre> genres){
        this.name = name;
        this.price = price;
        this.studio = studio;
        this.directors = directors;
        this.producers = producers;
        this.genres = genres;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public List<People> getDirectors() {
        return directors;
    }

    public void setDirectors(List<People> directors) {
        this.directors = directors;
    }

    public List<People> getProducers() {
        return producers;
    }

    public void setProducers(List<People> producers) {
        this.producers = producers;
    }

    public List<MovieGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<MovieGenre> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", studio=" + studio +
                ", directors=" + directors +
                ", producers=" + producers +
                ", genres=" + genres +
                '}';
    }
}
