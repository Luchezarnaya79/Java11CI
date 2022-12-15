package ru.netology.manager;

public class FilmItem {

    private int id;
    private String filmName;
    private int filmYear;


    public FilmItem(int id, String filmName, int filmYear) {
        this.id = id;
        this.filmName = filmName;
        this.filmYear = filmYear;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getFilmYear() {
        return filmYear;
    }

    public void setFilmYear(int filmYear) {
        this.filmYear = filmYear;
    }


}
