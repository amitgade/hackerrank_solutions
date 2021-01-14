package day13;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
