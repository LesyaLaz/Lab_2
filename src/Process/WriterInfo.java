package Process;

import MovieCollection.Movie;

import java.util.ArrayList;

public class WriterInfo {

    ArrayList<Movie> movieArrayList;

    public WriterInfo(ArrayList<Movie> movieArrayList) {
        this.movieArrayList = movieArrayList;
    }

    public void writeNames() {
        for (Movie movie: movieArrayList) {
            System.out.println(movie.getName());
        }
    }
}
