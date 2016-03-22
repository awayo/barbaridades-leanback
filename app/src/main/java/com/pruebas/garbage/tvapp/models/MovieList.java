package com.pruebas.garbage.tvapp.models;

import com.pruebas.garbage.tvapp.models.Movie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Category Zero"
    };

    public static List<Movie> list;

    public static List<Movie> setupMovies() throws IOException {
        list = new ArrayList<Movie>();
        return list;
    }
}
