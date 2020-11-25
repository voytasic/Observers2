package com.voytasic;

import java.util.HashSet;
import java.util.Set;

public class Blog implements Observable {

    private Set<Observer> observers = new HashSet<>();
    private String newestArticle;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public String getNewestArticle() {
        return newestArticle;
    }

    public void publishArticle(String article) {
        newestArticle = article;
        notifyObservers();
    }

    public static void main(String[] args) {
        Blog samouczek = new Blog();
        Reader reader1 = new Reader(samouczek);
        Reader reader2 = new Reader(samouczek);
        samouczek.attach(reader1);
        samouczek.attach(reader2);
        samouczek.publishArticle("Killer article title!");

        samouczek.detach(reader2); // sad panda :(
        samouczek.publishArticle("Another killer article title!");
    }
}
