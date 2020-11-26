package com.voytasic;

import java.util.EventListener;

public class Main {

    public static void main(String[] args) {
        Blog samouczek = new Blog();
        Reader reader1 = new Reader("reader1");
        Reader reader2 = new Reader("reader2");
        samouczek.attach(reader1);
        samouczek.attach(reader2);


        samouczek.publishArticle("Killer article title!");

        samouczek.detach(reader2);
        samouczek.publishArticle("Another killer article title!");
    }
}
