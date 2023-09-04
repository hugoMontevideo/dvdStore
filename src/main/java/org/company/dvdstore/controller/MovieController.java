package org.company.dvdstore.controller;

import org.company.dvdstore.entity.Movie;
import org.company.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController implements MovieControllerInterface {


    private MovieServiceInterface movieService;
//    MovieService movieService = new MovieService();
    public void addUsingConsole(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Titre :");
        String inputTitre= scan.nextLine();

        System.out.println("Genre : ");
        String inputGenre= scan.nextLine();

        scan.close();

        Movie movie = new Movie(inputTitre, inputGenre);

        movieService.registerMovie(movie);

        //   System.out.println(movie.getTitre() + " a été ajouté."); ******

    }

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public static interface MovieControllerInterface {

        void setInvoiceService(MovieServiceInterface invoiceService);
    }
}
