package ru.geekbrains.lesson7.observer;


/**
 * Интерфейс рассылки вакансий.
 *
 */
public interface Publisher {

    void sendOffer(Vacancy vacancy);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


}
