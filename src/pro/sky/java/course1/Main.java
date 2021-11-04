package pro.sky.java.course1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    private static Book[] books = new Book[5];


    public static void addBook(Book b){
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null){
                books[i] = b; //new Book(b.bookName,b.author,b.yearPublication);
                break;
            }
        }
    }
    public static void printBooks(Book[] books){
        int i = 0;
        while (i < books.length && books[i]!=null) {
                System.out.println(books[i].author.getSurname() + " " + books[i].author.getName() + ": " + books[i].getBookName() + ": " + books[i].getYearPublication());
                i++;
        }
    }

    public static void main(String[] args) {
        // work 1
        Author author1 = new Author("Толстой","Лев");
        Book book1 = new Book("Война и мер",author1,1867);

        Author author2 = new Author("Достоевский","Федор");
        Book book2 = new Book("Преступление и наказание",author2,1865 );


        Book book3 = new Book("Бесы",author2,1872 );

        book2.setYearPublication(1866);


        //work2
        System.out.println("---- work 2 start");
        addBook(book1);
        addBook(book2);
        printBooks(books);
        System.out.println("---- work 2 end");
        System.out.println();

        // work3
        System.out.println("---- work 3 start");
        Library library = new Library(5);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.printBooks();
        System.out.println();

        library.findBook(book3.getBookName());
        System.out.println();
        library.setBookPublishingYearByName(book2.getBookName(),1865);
        library.findBook(book2.getBookName());
        System.out.println("---- work 3 end");
    }
}
