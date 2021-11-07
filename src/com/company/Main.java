package com.company;

public class Main {

    //private static final Book [] arrayBooks = new Book[5];

    public static void main(String[] args) {
       /* Author author1 = new Author("Ivan","Ivanov");
        Author author2 = new Author("Petr","Petrov");

        Book book1;
        book1 = new Book("TestBook1",author1,2010);
        Book book2;
        book2 = new Book("TestBook2",author2,1806);

        book1.setPublicYearBook(2009);

        Library arrayBooks = new Library(5);

        //System.out.println(book1.equal(book1));

        arrayBooks.addBook(book1);
        arrayBooks.addBook(book2);

        arrayBooks.getInfoFromArrayBooks();

        arrayBooks.getInfoByNameBookFromArrayBooks(book1.getNameBook());
        arrayBooks.setPublicYearBookByNameBookFromArrayBooks(book1.getNameBook(),2011);
        */

        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equal(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equal(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equal(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equal(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");

        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(library);
    }
}
