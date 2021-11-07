package com.company;

import java.util.Objects;

public class Library {
    private static Book [] arrayBooks;

    public Library(int arrayLength) {
        arrayBooks = new Book[arrayLength];
    }

    public void addBook(Book addingBook) {
        for(int i=0;i<arrayBooks.length;i++){
            if(arrayBooks[i] == null) {
                arrayBooks[i] = addingBook;
                break;
            } else if (i==arrayBooks.length-1) {
                System.out.println("В массиве нет свободных мест");
            }
        }
    }

    public void getInfoFromArrayBooks() {
        for (Book arrayBook : arrayBooks) {
            if (arrayBook != null) {
                String nameBook = arrayBook.getNameBook();
                String firstNameAuthor = arrayBook.getAuthor().getFirstNameAuthor();
                String secondNameAuthor = arrayBook.getAuthor().getSecondNameAuthor();
                int publicYearBook = arrayBook.getPublicYearBook();
                System.out.print('"' + firstNameAuthor + ' ' + secondNameAuthor + ": "
                        + nameBook + ": " + publicYearBook + '"');
                System.out.print("\n");
            }
        }
    }

    public void getInfoByNameBookFromArrayBooks(String nameBook) {
        for (Book book : arrayBooks) {
            if (book != null &&  Objects.equals(book.getNameBook(), nameBook)) {
                System.out.println(book);
                break;
            }
        }
    }

    public void setPublicYearBookByNameBookFromArrayBooks(String nameBook, int publicYearBook) {
        for (Book arrayBook : arrayBooks) {
            if (arrayBook != null && Objects.equals(arrayBook.getNameBook(), nameBook)) {
                arrayBook.setPublicYearBook(publicYearBook);
            }
        }
    }

    public String toString() {
        StringBuilder string = new StringBuilder("Library \n");

        for (Book book : arrayBooks) {
            if (book != null) {
                string.append("Book: ")
                        .append(book.getNameBook())
                        .append(": by Author: ").append(book.getAuthor().getFirstNameAuthor()).append(" ").append(book.getAuthor().getSecondNameAuthor())
                        .append("\n");
            }
        }

        return string.toString();
    }
}
