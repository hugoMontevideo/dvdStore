package org.company.dvdstore.service;

import org.company.dvdstore.entity.Movie;
import org.company.dvdstore.repository.MovieRepositoryInterface;

public interface MovieServiceInterface {

    public void registerMovie(Movie movie);

    public void setMovieRepository(MovieRepositoryInterface movieRepository);
}
