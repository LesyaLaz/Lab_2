package MovieCollection;

public class Cartoon extends Movie {
    private String painter;
    private GraphStyle graphStyle;

    public Cartoon() {
        this.painter = "Unknown";
        this.graphStyle = GraphStyle.UNKNOWN;
    }

    public Cartoon(String name, Genre genre, String painter) {
        super(name, genre);
        this.painter = painter;
    }

    public Cartoon(String director, double length, String name, String painter, GraphStyle graphStyle, Genre genre) {
        super(director, length, name, genre);
        this.painter = painter;
        this.graphStyle = graphStyle;
    }

    public String getPainter() {
        return painter;
    }

    public GraphStyle getGraphStyle() {
        return graphStyle;
    }
}
