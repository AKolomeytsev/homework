package pro.sky.java.course1;

import java.util.Objects;

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
    @Override
    public String toString(){
        return "{'surname':'" + this.getSurname() +"','name':'" + this.getName() + "'}";
    }

    //@Override
    //public boolean equals(Author obj){
    //    return this.surname.equals(obj.getSurname()) && this.name.equals(obj.getName());
    //}
    @Override
    public int hashCode() {
        return Objects.hash(this.getSurname(), this.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(surname, author.surname) && Objects.equals(name, author.name);
    }
}
