package org.company.dvdstore.controller;

import org.company.dvdstore.entity.Movie;
import org.company.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    private MovieServiceInterface movieService;
//    MovieService movieService = new MovieService();
    public void addUsingConsole(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Titre :");
        String inputTitre= scan.next();

        System.out.println("Genre : ");
        String inputGenre= scan.next();

        Movie movie = new Movie(inputTitre, inputGenre);

        movieService.registerMovie(movie);

        System.out.println(movie.getTitre() + " a été ajouté.");

    }

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
}
