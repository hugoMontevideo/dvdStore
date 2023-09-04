package org.company.dvdstore.repository;

import org.company.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface {

    public void add(Movie movie){

        FileWriter writer;
        try{

            writer=new FileWriter("C:\\temp\\movie.txt",true);
            writer.write(movie.getTitre() + ";" + movie.getGenre() +"\n");
            writer.close();

            System.out.println( "Stockage mémoire ok " + movie.getTitre() );

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
