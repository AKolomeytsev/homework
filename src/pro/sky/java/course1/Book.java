package pro.sky.java.course1;

public class Book {
    String bookName;
    Author author;
    int yearPublication;

    public Book(String bookName, Author author, int yearPublication){
        this.bookName = bookName;
        this.author = author;
        this.yearPublication = yearPublication;
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
    public void setYearPublication(int yearPublication){
        this.yearPublication = yearPublication;
    }
}
