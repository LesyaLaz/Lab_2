package MovieCollection;

public enum Genre {
    DRAMA("drama"), LOVE("love"), ACTION("action"), HORROR("horror"), UNKNOWN("Unknown");

    private final String text;

    Genre(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
