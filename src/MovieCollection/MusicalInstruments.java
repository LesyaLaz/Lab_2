package MovieCollection;

public enum MusicalInstruments {

    PIANO("piano"), GUITAR("guitar"), UNKNOWN("Unknown");;

    private final String text;

    MusicalInstruments(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
