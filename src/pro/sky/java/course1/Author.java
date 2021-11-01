package pro.sky.java.course1;

public class Author {
    String surname;
    String name;

    public Author(String s,String n){
        this.surname = s;
        this.name = n;
    }

    public String getSurname(){
        return this.surname;
    }
    public String getName(){
        return this.name;
    }
}
