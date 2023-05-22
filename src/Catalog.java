import java.util.List;

public interface Catalog {

    void addSong(int id, String title, String artist, double price);

    List<Song> searchByArtist(String artist);
    List<Song> searchByTitle(String title);
    Music searchById(int id);
    List<Song> getAllSongs();


    default Song createSong(int id, String title, String artist, double price, SongFactory factory) {
        return factory.createSong(id, title, artist, price);
    }
}
