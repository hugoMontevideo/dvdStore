package org.company.dvdstore.repository;

import org.company.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;


public class MemoryMovieRepository implements MovieRepositoryInterface{

    private static List<Movie> movies = new ArrayList<>();
    public void add(Movie movie){
        movies.add(movie);
        //   System.out.printf("The movie %d has been added", movie.getTitre());
    }
}
