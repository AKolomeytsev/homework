package pro.sky.java.course1;

public class Employee {
    static int cnt = 0;
    private int id;
    private String fio;
    private int oldel;
    private double  salary;

    private int genId(){
        cnt++;
        return cnt;
    }
    public Employee(String fio,int otdel,double salary) {
        this.id = this.genId();
        this.fio = fio;
        this.oldel = otdel;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }
    public String getFio() {
        return this.fio;
    }

    public int getOldel() {
        return this.oldel;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setOldel(int oldel) {
        this.oldel = oldel;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public StringBuilder toString(boolean flag) {
        StringBuilder str = new StringBuilder();
        if(!flag) {
           str =  new StringBuilder("Сотрудник:" + '\n' + "   id: " + id + '\n' + "   Ф.И.О: " + fio + '\n' + "   Отдел: " + oldel + '\n' + "   заработная плата: " + salary + '\n');
        }else {
            str = new StringBuilder("Сотрудник:" + '\n' + "   id: " + id + '\n' + "   Ф.И.О: " + fio + '\n' + "   заработная плата: " + salary + '\n');
        }
       return str;

    }

}
