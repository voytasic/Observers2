package com.voytasic;

public class Reader implements Observer {
    private String readerName;

    private String newestArticle;

    public Reader(String readerName) {
        this.readerName = readerName;
    }

    @Override
    public void update(ArticleEvent ae) {
        newestArticle = (String) ae.event;
        System.out.println(String.format("%s: An article „%s” was published!", readerName, newestArticle));
    }


}
