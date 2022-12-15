package ru.netology.manager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    FilmItem film1 = new FilmItem(11, "Одиночество", 2022);
    FilmItem film2 = new FilmItem(67, "Практика", 2019);
    FilmItem film3 = new FilmItem(45, "Шанс", 2013);

    FilmItem film4 = new FilmItem(15, "Практика-1", 2019);
    FilmItem film5 = new FilmItem(49, "Высота", 2011);

    @Test
    public void addManager() {
        FilmManager repo = new FilmManager();

        repo.add(film1);
        repo.add(film2);
        repo.add(film3);
        repo.add(film4);
        repo.add(film5);

        FilmItem[] expected = {film1, film2, film3, film4, film5};
        FilmItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LastFilms() {
        FilmManager repo = new FilmManager();

        repo.add(film1);
        repo.add(film2);
        repo.add(film3);


        FilmItem[] expected = {film3, film2, film1};
        FilmItem[] actual = repo.lastFilm();

        Assertions.assertArrayEquals(expected, actual);
    }
}
