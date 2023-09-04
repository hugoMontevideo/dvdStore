package org.company.dvdstore;

import org.company.dvdstore.controller.MovieController;
import org.company.dvdstore.repository.FileMovieRepository;
import org.company.dvdstore.repository.MovieRepositoryInterface;
import org.company.dvdstore.service.DefaultMovieService;
import org.company.dvdstore.service.MovieServiceInterface;

public class App 
{
    public static void main( String[] args )
    {
        String service = "org.company.dvdstore.service.DefaultMovieService";
        String repository = "org.company.dvdstore.repository.MemoryMovieRepository";
        MovieServiceInterface movieService1 = null;
        MovieRepositoryInterface movieRepository = null;

//        movieController=(MovieRepositoryInterface ) Class.forName(controller).getDeclaredConstructor().newInstance();
        try {
            movieService1 = (MovieServiceInterface) Class.forName(service).getDeclaredConstructor().newInstance();

            movieRepository = (MovieRepositoryInterface) Class.forName(repository).getDeclaredConstructor().newInstance();

            MovieController movieController= new MovieController();
            movieController.setMovieService(movieService1);
            movieService1.setMovieRepository(movieRepository);

            movieController.addUsingConsole();

        }catch (Exception e){
            e.printStackTrace();
        }

    }


//

}


//        MovieServiceInterface movieService = new DefaultMovieService();
//        MovieRepositoryInterface movieRepository = new FileMovieRepository();
//
