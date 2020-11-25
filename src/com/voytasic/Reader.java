package com.voytasic;

public class Reader implements Observer {
    private String readerName;
    private final Blog blog;
    private String newestArticle;

    public Reader(String readerName, Blog blog) {
        this.readerName = readerName;
        this.blog = blog;
        newestArticle = blog.getNewestArticle();
    }

    @Override
    public void update() {
        newestArticle = blog.getNewestArticle();
        System.out.println(String.format("%s: An article „%s” was published!", readerName, newestArticle));
    }
    public void subscribe() {
        this.blog.attach(this);
    }
    public void unsubscribe(){
        this.blog.detach(this);
    }
}
