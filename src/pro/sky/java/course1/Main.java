package pro.sky.java.course1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Author author1 = new Author("Толстой","Лев");
        Book book1 = new Book("Война и мер",author1,1867);

        Author author2 = new Author("Достоевский","Федор");
        Book book2 = new Book("Преступление и наказание",author2,1866 );


        Book book3 = new Book("Бесы",author2,1872 );



        Author author3 = new Author("Маршак","Самуил");
        Author author4 = new Author("Маршак","Самуил");
        System.out.println(author3.toString());
        System.out.println(author4.equals(author3));
        System.out.println(author4.hashCode());

        System.out.println(book2.toString());
        System.out.println(book2.hashCode());

        Book book5 = new Book("Преступление и наказание",author2,1866 );
        System.out.println(book5.toString());
        System.out.println(book5.equals(book2));

        Library library = new Library(5);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book5);

        System.out.println(library.toString());

    }
}
