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
    public void notifyObservers(ArticleEvent ae) {
        observers.forEach(observer -> observer.update(ae));
    }

    public String getNewestArticle() {
        return newestArticle;
    }

    public void publishArticle(String article) {
        newestArticle = article;
        ArticleEvent ae = new ArticleEvent(this, newestArticle);
        notifyObservers(ae);
    }


}
