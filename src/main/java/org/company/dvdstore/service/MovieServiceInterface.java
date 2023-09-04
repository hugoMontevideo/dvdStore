package org.company.dvdstore.service;

import org.company.dvdstore.entity.Movie;
import org.company.dvdstore.repository.MovieRepositoryInterface;

public interface MovieServiceInterface {

    void registerMovie(Movie movie);

    void setMovieRepository(MovieRepositoryInterface movieRepository);
}
