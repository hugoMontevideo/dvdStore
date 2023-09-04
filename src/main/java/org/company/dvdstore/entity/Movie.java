package org.company.dvdstore.entity;

public class Movie {
    private String titre;
    private String genre;

    public Movie(String titre, String genre){
        this.titre = titre;
        this.genre = genre;
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String title) {
        this.titre = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
