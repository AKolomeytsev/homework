package pro.sky.java.course1;

public class Author {
    String surname;
    String name;

    public Author(String surname,String name){
        this.surname = surname;
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }
    public String getName(){
        return this.name;
    }
}
