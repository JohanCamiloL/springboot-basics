package io.johancamilo.springbootbasics;

public class Book {

    private int id;
    private String author;
    private String topic;
    private int publishYear;

    public Book() {

    }

    public Book(int id, String author, String topic, int publishYear) {
        this.id = id;
        this.author = author;
        this.topic = topic;
        this.publishYear = publishYear;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return String.format("{id: %d, author: %s, topic: %s, publishYear: %d}", id, author, topic, publishYear);
    }
}
