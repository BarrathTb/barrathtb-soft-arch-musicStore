public class Music {
    private int id;
    private String title;
    private String artist;
    private double price;

    // Constructor
    public Music(int id, String title, String artist, double price) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }
    

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }
}
