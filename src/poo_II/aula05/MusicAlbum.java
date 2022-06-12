package poo_II.aula05;

import java.util.List;

public class MusicAlbum extends Item{

    protected List<Band> bands;
    protected List<MusicGenre> genres;
    protected String label;

    public MusicAlbum(int id, String name, double price, List<Band> bands, List<MusicGenre> genres, String label) {
        super(id, name, price);
        this.bands = bands;
        this.genres = genres;
        this.label = label;
    }

    protected void updateMusicAlbum(String name, double price, List<Band> bands, List<MusicGenre> genres, String label){
        this.name = name;
        this.price = price;
        this.bands = bands;
        this.genres = genres;
        this.label = label;
    }


    public List<Band> getBands() {
        return bands;
    }

    public void setBands(List<Band> bands) {
        this.bands = bands;
    }

    public List<MusicGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<MusicGenre> genres) {
        this.genres = genres;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bands=" + bands +
                ", genres=" + genres +
                ", label='" + label + '\'' +
                '}';
    }
}
