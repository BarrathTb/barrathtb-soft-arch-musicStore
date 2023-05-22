import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MusicStore implements Catalog {
    private static MusicStore instance;
    private List<Song> songs;
    private SongFactory songFactory;


    public MusicStore(List<Song> songs, SongFactory songFactory) {
        this.songs = new ArrayList<>(songs);
        this.songFactory = songFactory;
    }
    public static synchronized MusicStore getInstance() {
        if (instance == null) {
            // By default, we'll use a factory that creates regular Song objects
            instance = new MusicStore(new ArrayList<>(), new RegularSongFactory());
        }
        return instance;
    }

    @Override
    public void addSong(int id, String title, String artist, double price) {
        Song song;
        if (price == 0.99) {
            RegularSongFactory factory = new RegularSongFactory();
            song = factory.createSong(id, title, artist, price);
        } else if (price == 2.99) {
            PremiumSongFactory factory = new PremiumSongFactory();
            song = factory.createSong(id, title, artist, price);
        } else {
            throw new IllegalArgumentException("Invalid song price: " + price);
        }
        songs.add(song);
    }

    @Override
    public List<Song> searchByArtist(String artist) throws IllegalArgumentException {
        List<Song> matchingSongs = new ArrayList<>();
        List<String[]> replacements = Arrays.asList(new String[][] {{"\\/", " "}});
        String normalizedArtist = StringUtils.normalize(artist, replacements);
        for (Song song : songs) {
            String normalizedSongArtist = StringUtils.normalize(song.getArtist(), replacements);
            if (normalizedSongArtist.equals(normalizedArtist)) {
                matchingSongs.add(song);
            }
        }
        if (matchingSongs.isEmpty()) {
            throw new IllegalArgumentException("No songs found for artist: " + artist);
        } else {
            return matchingSongs;
        }
    }

    @Override
    public List<Song> searchByTitle(String title) throws IllegalArgumentException {
        List<Song> matchingSongs = new ArrayList<>();
        List<String[]> replacements = Arrays.asList(new String[][] {{"\\/", " "}});
        String normalizedTitle = StringUtils.normalize(title, replacements);
        for (Song song : songs) {
            String normalizedSongTitle = StringUtils.normalize(song.getTitle(), replacements);
            if (normalizedSongTitle.equals(normalizedTitle)) {
                matchingSongs.add(song);
            }
        }
        if (matchingSongs.isEmpty()) {
            throw new IllegalArgumentException("No songs found for title: " + title);
        } else {
            return matchingSongs;
        }
    }


    @Override
    public Song searchById(int id) throws IllegalArgumentException {
        for (Song song : songs) {
            if (song.getId() == id) {
                return song;
            }
        }
        throw new IllegalArgumentException("No song found with ID " + id);
    }


    @Override
    public List<Song> getAllSongs() {
        return songs;
    }
    public List<Song> getRegularSongs() {
        return searchByPrice(instance, "regular");
    }

    public List<Song> getPremiumSongs() {
        return searchByPrice(instance, "premium");
    }

    private List<Song> searchByPrice(MusicStore catalog,String catalogType) {
        switch (catalogType) {
            case "regular":
                return catalog.getAllSongs().stream()
                        .filter(song -> song.getPrice() == 0.99)
                        .collect(Collectors.toList());
            case "premium":
                return catalog.getAllSongs().stream()
                        .filter(song -> song.getPrice() == 2.99)
                        .collect(Collectors.toList());
            default:
                throw new IllegalArgumentException("Invalid catalog type: " + catalogType);
        }
    }
}
