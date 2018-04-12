package MovieCollection;

public enum GraphStyle {

    THREE_D("3D"), TWO_D("2D"), UNKNOWN("Unknown");

    private final String text;

    GraphStyle(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
