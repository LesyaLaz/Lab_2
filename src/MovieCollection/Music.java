package MovieCollection;

public class Music extends Movie {
    private int countSongs; //default 0
    private MusicalInstruments musicalInstruments;

    public Music() {
        musicalInstruments = MusicalInstruments.UNKNOWN;
    }

    public Music(String name, Genre genre, MusicalInstruments musicalInstruments) {
        super(name, genre);
        this.musicalInstruments = musicalInstruments;
    }

    public Music(String director, double length, String name, Genre genre, int countSongs,
                 MusicalInstruments musicalInstruments) {
        super(director, length, name, genre);
        this.countSongs = countSongs;
        this.musicalInstruments = musicalInstruments;
    }

    public int getCountSongs() {
        return countSongs;
    }

    public MusicalInstruments getMusicalInstruments() {
        return musicalInstruments;
    }
}




