package Process;

import MovieCollection.*;

import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList();

        list.add(new Cartoon());
        list.add(new Cartoon("Piggy", Genre.LOVE, "Dali"));
        list.add(new Cartoon("Antony", 122, "Piggy 2", "Dali",
                GraphStyle.TWO_D, Genre.ACTION));

        list.add(new History());
        list.add(new History("Thor", Genre.ACTION, HistoryPeriod.UNKNOWN));
        list.add(new History("Sergey", 111, "Maggie 2", Genre.LOVE,
                HistoryPeriod.MODERN, false));

        list.add(new Music());
        list.add(new Music("Melody", Genre.DRAMA, MusicalInstruments.PIANO));
        list.add(new Music("Sergey", 121, "Maggie 2",
                Genre.LOVE, 3, MusicalInstruments.PIANO));

        new WriterInfo(list).writeNames();
    }

}
