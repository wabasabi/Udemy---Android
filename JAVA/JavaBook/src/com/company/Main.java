//Examples of setters and getters with java classes.
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book book1 = new Book();

        book1.showGetters();

        book1.setAuthor("Ryan Harrington");
        book1.setTitle("HOW TO: JAVA CLASSES");
        book1.setPrice(19.99);

        book1.showGetters();
    }
}
