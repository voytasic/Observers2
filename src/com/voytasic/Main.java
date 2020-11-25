package com.voytasic;

public class Main {

    public static void main(String[] args) {
        Blog samouczek = new Blog();
        Reader reader1 = new Reader("reader1", samouczek);
        Reader reader2 = new Reader("reader2", samouczek);
        reader1.subscribe();
        reader2.subscribe();

        samouczek.publishArticle("Killer article title!");

        reader2.unsubscribe();
        samouczek.publishArticle("Another killer article title!");
    }
}
