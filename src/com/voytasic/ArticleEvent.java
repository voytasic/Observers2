package com.voytasic;

public class ArticleEvent {
    Observable source;
    String event;

    public ArticleEvent(Observable source, String event) {
        this.source = source;
        this.event = event;
    }
}
