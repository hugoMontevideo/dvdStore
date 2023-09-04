package org.company.dvdstore.service;

import org.company.dvdstore.entity.Movie;
import org.company.dvdstore.repository.MovieRepositoryInterface;

public class DefaultMovieService implements MovieServiceInterface{

    MovieRepositoryInterface movieRepository;
    //    GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
        //   System.out.println("Enregistrement en magasin"); ***** 1
    }

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }
}
