package com.company;

import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author author;
    private int publicYearBook;

    public Book(String nameBook, Author author, int publicYearBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.publicYearBook = publicYearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicYearBook() {
        return publicYearBook;
    }

    public void setPublicYearBook(int publicYearBook) {
        this.publicYearBook = publicYearBook;
    }

    public String toString() {

        return "Book: " +
                getNameBook() +
                ": by Author: " +
                getAuthor().getFirstNameAuthor() + " " + getAuthor().getSecondNameAuthor();
    }

    public boolean equal(Book book) {

        boolean isEqual;

        isEqual=Objects.equals(getNameBook(), book.getNameBook())
                && getAuthor().equal(book.getAuthor())
                && getPublicYearBook()==book.getPublicYearBook();

        return isEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameBook() + " " + getAuthor().toString() + " " + getPublicYearBook());
    }
}
