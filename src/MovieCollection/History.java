package MovieCollection;

public class History extends Movie {

    private HistoryPeriod period;
    private boolean isBasedOnRealEvents; //default false

    public History() {
        period = HistoryPeriod.UNKNOWN;
    }

    public History(String name, Genre genre, HistoryPeriod period) {
        super(name, genre);
        this.period = period;
    }

    public History(String director, double length, String name, Genre genre,
                   HistoryPeriod period, boolean isBasedOnRealEvents) {
        super(director, length, name, genre);
        this.period = period;
        this.isBasedOnRealEvents = isBasedOnRealEvents;
    }

    public HistoryPeriod getPeriod() {
        return period;
    }

    public boolean isBasedOnRealEvents() {
        return isBasedOnRealEvents;
    }
}
