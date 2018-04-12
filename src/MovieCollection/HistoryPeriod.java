package MovieCollection;

public enum HistoryPeriod {

    ANTIQUITY("antiquity"), MODERN("modern"), UNKNOWN("Unknown");

    private final String text;

    HistoryPeriod(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
