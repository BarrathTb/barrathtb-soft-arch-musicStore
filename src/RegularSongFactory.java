class RegularSongFactory implements SongFactory {
    private int nextId = 1;
    private double regPrice = 0.99;

    public Song createSong(int id, String title, String artist, double price) {

        if (id == 0) {
            // If the ID isn't specified, generate a new one
            id = nextId++;
        }
        return new Song(id, title, artist, regPrice);
    }
}