package pro.sky.java.course1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void addBook(Book[] cb,Book b){
        for (int i = 0; i < cb.length; i++) {
            if(cb[i] == null){
                cb[i] = new Book(b.bookName,b.author,b.yearPublication);
                break;
            }
        }
    }
    public static void printBooks(Book[] cb){
        int i = 0;
        while (i < cb.length && cb[i]!=null) {
                System.out.println(cb[i].author.getSurname() + " " + cb[i].author.getName() + ": " + cb[i].getBookName() + ": " + cb[i].getYearPublication());
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
        Book[] books = new Book[5];

        // work2
        addBook(books,book1);
        addBook(books,book2);
        printBooks(books);
        System.out.println();

        // work3
        Library library = new Library(5);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.printBooks();
        System.out.println();

        library.findPrintBook(book2.getBookName());
        System.out.println();
        library.setYearFindBook(book2.getBookName(),1865);
        library.findPrintBook(book2.getBookName());

    }
}
