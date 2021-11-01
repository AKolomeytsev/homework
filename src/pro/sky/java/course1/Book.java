package pro.sky.java.course1;

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
}
