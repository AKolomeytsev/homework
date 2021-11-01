package pro.sky.java.course1;

public class Library {
    private Book[] books;
    public Library(int size){
        books = new Book[size];
    }
    public void addBook(Book b){
        for (int i = 0; i < this.books.length; i++) {
            if(this.books[i] == null){
                this.books[i] = new Book(b.bookName,b.author,b.yearPublication);
                break;
            }
        }
    }
    public void printBooks(){
        int i = 0;
        while (i < this.books.length && this.books[i]!=null) {
            System.out.println(this.books[i].author.getSurname() + " " + this.books[i].author.getName() + ": " + this.books[i].getBookName() + ": " + this.books[i].getYearPublication());
            i++;
        }
    }

    public void findPrintBook(String n){
        int i = 0;
        Boolean flag = false;
        while (i < this.books.length && !flag) {
            if(this.books[i].getBookName().trim().toUpperCase().equals(n.trim().toUpperCase())) {
                System.out.println(this.books[i].author.getSurname() + " " + this.books[i].author.getName() + ": " + this.books[i].getBookName() + ": " + this.books[i].getYearPublication());
                flag = true;
            }
            i++;
        }
        if (!flag) {
            System.out.println("Книга не найдена!");
        }
    }
    public void setYearFindBook(String n,int y){
        int i = 0;
        Boolean flag = false;
        while (i < this.books.length && !flag) {
            if(this.books[i].getBookName().trim().toUpperCase().equals(n.trim().toUpperCase())) {
                this.books[i].setYearPublication(y);
                flag = true;
            }
            i++;
        }
        if (!flag) {
            System.out.println("Книга не найдена!");
        }
    }
}
