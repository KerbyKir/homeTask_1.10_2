package com.company;

import java.util.Objects;

public class Author {
    private final String firstNameAuthor;
    private final String secondNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.secondNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public String getSecondNameAuthor() {
        return secondNameAuthor;
    }

    public String toString() {
        return "Author: "+getFirstNameAuthor()+" "+getSecondNameAuthor();
    }

    public boolean equal(Author author) {

        boolean isEqual;

        isEqual= Objects.equals(getFirstNameAuthor(), author.getFirstNameAuthor())
                && Objects.equals(getSecondNameAuthor(), author.getSecondNameAuthor());

        return isEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstNameAuthor() + " " + getSecondNameAuthor());
    }
}
