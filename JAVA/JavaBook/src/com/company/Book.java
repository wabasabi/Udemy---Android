package com.company;

/**
 * Created by harrington on 12/14/2015.
 */
public class Book {
    private String title;
    private String author;
    private double price;

    //class constructor
    public Book(){
        title = "!NO TITLE FOUND!";
        author = "!NO AUTHOR FOUND!";
        price = 0.00;

        System.out.println("Book successfully created.");
    }

    //setters & getters
    public void setTitle(String bookTitle){
        title = bookTitle;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String authorName){
        author = authorName;
    }

    public String getAuthor(){
        return author;
    }

    public void setPrice(double priceOfBook){
        price = priceOfBook;
    }

    public double getPrice(){
        return price;
    }

    //method that prints out all getters.
    public void showGetters(){
        System.out.println("The title of the book is: " + getTitle());
        System.out.println("The author of the book is: " + getAuthor());
        System.out.println("The price of the book is: " + getPrice());
    }
}
