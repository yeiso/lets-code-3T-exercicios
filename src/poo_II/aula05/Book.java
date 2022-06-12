package poo_II.aula05;

import java.util.List;

public class Book extends Item{

    protected List<BookGenre> genres;
    protected List<People> writers;
    protected Publisher publisher;

    public Book(int id, String name, double price, List<BookGenre> genres, List<People> writers, Publisher publisher) {
        super(id, name, price);
        this.genres = genres;
        this.writers = writers;
        this.publisher = publisher;
    }

    protected void updateBook(String name, double price, List<BookGenre> genres, List<People> writers, Publisher publisher){
        this.name = name;
        this.price = price;
        this.genres = genres;
        this.writers = writers;
        this.publisher = publisher;
    }

    public List<BookGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<BookGenre> genres) {
        this.genres = genres;
    }

    public List<People> getWriters() {
        return writers;
    }

    public void setWriters(List<People> writers) {
        this.writers = writers;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genres=" + genres +
                ", writers=" + writers +
                ", publisher=" + publisher +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
