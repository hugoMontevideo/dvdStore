package org.company.dvdstore;

import org.company.dvdstore.controller.MovieControllerInterface;
import org.company.dvdstore.repository.FileMovieRepository;
import org.company.dvdstore.repository.MovieRepositoryInterface;
import org.company.dvdstore.service.DefaultMovieService;
import org.company.dvdstore.service.MovieServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MovieControllerInterface movieController = context.getBean(MovieControllerInterface.class);
        movieController.addUsingConsole();

    }


//

}

// différentes versions


//        MovieServiceInterface movieService = new DefaultMovieService();
//        MovieRepositoryInterface movieRepository = new FileMovieRepository();
//
//        String service = "org.company.dvdstore.service.DefaultMovieService";
//        String repository = "org.company.dvdstore.repository.FileMovieRepository";
//        MovieServiceInterface movieService1 = null;
//        MovieRepositoryInterface movieRepository = null;

// try {
//         movieService1 = (MovieServiceInterface) Class.forName(service).getDeclaredConstructor().newInstance();
//
//         movieRepository = (MovieRepositoryInterface) Class.forName(repository).getDeclaredConstructor().newInstance();
//
//         MovieController movieController= new MovieController();
//         movieController.setMovieService(movieService1);
//         movieService1.setMovieRepository(movieRepository);
//
//         movieController.addUsingConsole();
//
//         }catch (Exception e){
//         e.printStackTrace();
//         }