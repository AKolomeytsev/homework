package pro.sky.java.course1;

import java.util.Objects;

public class Book {
    String bookName;
    Author author;
    int yearPublication;

    public Book(String b, Author a, int y){
        bookName = b;
        author = a;
        yearPublication = y;
    }
    public String getBookName(){
        return this.bookName;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYearPublication(){
        return this.yearPublication;
    }
    public void setYearPublication(int y){
        this.yearPublication = y;
    }
    @Override
    public String toString(){
        return "{'bookName':'" + this.getBookName() + "','author':'" + this.author.toString()+ "','yearPublication':'" + this.getYearPublication() + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getBookName(), this.getYearPublication())+this.author.hashCode();
    }
}
