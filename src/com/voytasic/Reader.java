package com.voytasic;

public class Reader implements Observer {
    private final Blog blog;
    private String newestArticle;

    public Reader(Blog blog) {
        this.blog = blog;
        newestArticle = blog.getNewestArticle();
    }

    @Override
    public void update() {
        newestArticle = blog.getNewestArticle();
        System.out.println(String.format("An article „%s” was published!",  newestArticle));
    }
}
