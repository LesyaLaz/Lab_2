package MovieCollection;

public abstract class Movie {
    private String director;
    private double length; //minutes
    private String name;
    private Genre genre;

    public Movie() {
        this.director = "Unknowm";
        this.name = "Unknown";
        this.genre = Genre.UNKNOWN;
    }

    public Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
        this.director = "Unknowm";
    }

    public Movie(String director, double length, String name, Genre genre) {
        this.director = director;
        this.length = length;
        this.name = name;
        this.genre = genre;
    }





    public String getDirector() {
        return director;
    }

    public double getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }
}
