public class PremiumSongFactory implements SongFactory {
    private int nextId = 1;
    private double premPrice = 2.99;

    public Song createSong(int id, String title, String artist, double price) {

        if (id == 0) {
            id = nextId++;
        }
        return new Song(id, title, artist, premPrice);
    }
}