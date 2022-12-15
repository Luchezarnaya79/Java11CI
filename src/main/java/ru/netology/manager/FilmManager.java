package ru.netology.manager;

public class FilmManager {

    private FilmItem[] items = new FilmItem[0];
    private int limit;

    public FilmManager () {
        this.limit = 10;
    }

    public FilmManager (int limit) {
        this.limit = limit;
    }


    public void add(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {
        return items;
    }

    public FilmItem [] lastFilm () {
        int maxlenght;
        if (items.length <limit) {
            maxlenght = items.length;
        }else {
            maxlenght = limit;
        }
        FilmItem[] tmp = new FilmItem[maxlenght];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[items.length-1-i];
        }

        return tmp;
    }

    
}
