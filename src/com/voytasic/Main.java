package com.voytasic;

public class Main {

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
