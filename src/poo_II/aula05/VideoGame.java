package poo_II.aula05;

import java.util.List;

public class VideoGame extends Item{

    private Distributor distributor;
    private Studio studio;
    protected List<GameGenre> genres;

    public VideoGame(int id, String name, double price, Distributor distributor, Studio studio, List<GameGenre> genres) {
        super(id, name, price);
        this.distributor = distributor;
        this.studio = studio;
        this.genres = genres;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public List<GameGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<GameGenre> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", distributor=" + distributor +
                ", studio=" + studio +
                ", genres=" + genres +
                '}';
    }
}
