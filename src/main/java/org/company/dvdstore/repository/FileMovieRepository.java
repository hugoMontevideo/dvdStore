package org.company.dvdstore.repository;

import org.company.dvdstore.entity.Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface {

    File file ;
    public void add(Movie movie){

        FileWriter writer;
        try{
            writer = new FileWriter(file, true);
//            writer=new FileWriter("C:\\temp\\movie.txt",true);
            writer.write(movie.getTitre() + ";" + movie.getGenre() +"\n");
            writer.close();

            System.out.printf( "Stockage dans le disque dur de %s \n",movie.getTitre() );

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
