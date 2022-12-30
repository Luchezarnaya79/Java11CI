package ru.netology.manager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    FilmItem film1 = new FilmItem(11, "Одиночество", 2022);
    FilmItem film2 = new FilmItem(67, "Практика", 2019);
    FilmItem film3 = new FilmItem(45, "Шанс", 2013);

    FilmItem film4 = new FilmItem(15, "Практика-1", 2019);
    FilmItem film5 = new FilmItem(22, "Практика-2", 2019);
    FilmItem film6 = new FilmItem(16, "Практика-3", 2019);

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

    @Test
    public void LastFilmsMax() {
        FilmManager repo = new FilmManager();

        repo.add(film1);
        repo.add(film2);
        repo.add(film3);
        repo.add(film4);
        repo.add(film5);


        FilmItem[] expected = {film5, film4, film3, film2, film1};
        FilmItem[] actual = repo.lastFilm();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LastFilmsMaxMax() {
        FilmManager repo = new FilmManager();

        repo.add(film1);
        repo.add(film2);
        repo.add(film3);
        repo.add(film4);
        repo.add(film5);
        repo.add(film6);


        FilmItem[] expected = {film6, film5, film4, film3, film2};
        FilmItem[] actual = repo.lastFilm();

        Assertions.assertArrayEquals(expected, actual);
    }
}
