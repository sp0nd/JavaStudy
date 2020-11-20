package com.tuyano.gradle;

public class Book {
    String title;
    String author;

    void show() { System.out.println(title + " : " + author); }

    public Book() {
        this("", "");
        System.out.println("little princess Saint Exupery");
    }

    public Book(String title) {
        this(title, "Erich Segal");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String [] args) {
        Book littlePrince = new Book("little princess", "Saint Exupery");
        Book loveStory = new Book("LoveStory");
        Book emptyBook = new Book();
        loveStory.show();
        loveStory.title="block chain";
        loveStory.author="kim taejun";
        loveStory.show();
        littlePrince.show();
        emptyBook.show();
    }
}