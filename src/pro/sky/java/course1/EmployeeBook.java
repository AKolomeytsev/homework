package pro.sky.java.course1;

import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees;
    public EmployeeBook(int size){
        this.employees = new Employee[size];
    }
    public void addEmployee(Employee employee){
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i] == null){
                this.employees[i] = employee;
                break;
            }
        }
    }
    public void  printList(int otdel){
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i]!=null)
                switch (otdel){
                    case -1:
                        System.out.println(this.employees[i].toString(false));
                    default:
                        if(this.employees[i].getOldel() == otdel){
                            System.out.println(this.employees[i].toString(true));
                        }
                }
        }
    }
    public double getSumSalary(int otdel){
        double salary = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i]!=null) {
                if(otdel!=-1){
                    if(this.employees[i].getOldel() == otdel){
                        salary += this.employees[i].getSalary();
                    }
                }else {
                    salary += this.employees[i].getSalary();
                }
            }
        }
        return salary;
    }
    public int findMinSalary(int otdel){
        int index = 0;
        for (int i = 1; i < this.employees.length; i++) {
            if(this.employees[i]!=null) {
                switch (otdel) {
                    case -1:
                        if (this.employees[i].getSalary() < this.employees[index].getSalary()) {
                            index = i;
                        }
                    default:
                        if (this.employees[i].getSalary() < this.employees[index].getSalary() && this.employees[i].getOldel() == otdel) {
                            index = i;
                        }
                }
            }
        }
        return index;
    }
    public int findMaxSalary(int otdel){
        int index = 0;
        for (int i = 1; i < this.employees.length; i++) {
            if(this.employees[i]!=null) {
                switch(otdel) {
                    case -1:
                        if (this.employees[i].getSalary() > this.employees[index].getSalary()) {
                            index = i;
                        }
                    default:
                        if (this.employees[i].getSalary() > this.employees[index].getSalary() && this.employees[i].getOldel() == otdel) {
                            index = i;
                        }
                }
            }
        }
        return index;
    }
    public double averageSalary(int otdel){
        double salary = 0;
        int cnt = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i]!=null) {
                switch (otdel){
                    case -1:
                        salary += this.employees[i].getSalary();
                        cnt++;
                    default:
                        if(this.employees[i].getOldel() == otdel){
                            salary += this.employees[i].getSalary();
                            cnt++;
                        }
                }
            }
        }
        return salary/cnt;
    }
    public void printFio(){
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i]!=null)
                System.out.println(this.employees[i].getFio());
        }
    }
    public void printMessage(String message,int item){
        System.out.println(message+this.employees[item].getSalary()+", сотрудник: " + this.employees[item].getFio());
    }
    public void indexSalary(int procent,int otdel){
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i]!=null)
                switch (otdel){
                    case -1:
                        this.employees[i].setSalary(this.employees[i].getSalary()+((this.employees[i].getSalary()/100)*procent));
                    default:
                        if(this.employees[i].getOldel() == otdel){
                            this.employees[i].setSalary(this.employees[i].getSalary()+((this.employees[i].getSalary()/100)*procent));
                        }
                }
        }
    }
    public void listEmloyeeConditional(int flag,double salary){
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] != null) {
                switch (flag) {
                    case 1:
                        if (this.employees[i].getSalary() < salary)
                            System.out.println(this.employees[i].toString(true));
                        break;
                    case 2:
                        if (this.employees[i].getSalary() > salary)
                            System.out.println(this.employees[i].toString(true));
                        break;
                    case 3:
                        if (this.employees[i].getSalary() == salary)
                            System.out.println(this.employees[i].toString(true));

                }
            }
        }
    }
    public int findById(int id){
        int index = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i]!=null) {
                if (this.employees[i].getId() == id) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
    public int findByFio(String fio){
        int index = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i]!=null) {
                if (this.employees[i].getFio() == fio) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
    public void deleteEmployeeByIndex(int index){
        this.employees[index] = null;
    }
    public void editOtdelEmployeeByIndex(int index,int otdel){
        this.employees[index].setOldel(otdel);
    }
    public void editSalaryByIndex(int index,int otdel){
        this.employees[index].setSalary(otdel);
    }
    public int[] distinctOtdels(){
        int cnt = 0;
        int[] tmpOtdels = new int[this.employees.length];
        boolean flag = false;
        tmpOtdels[0] = this.employees[0].getOldel();
        for (int i = 1; i < this.employees.length; i++) {
            flag = false;
            for (int j = 0; j < tmpOtdels.length; j++) {
                if(tmpOtdels[j] == this.employees[i].getOldel()){
                    flag = true;
                    break;
                } else if(tmpOtdels[j] == 0 && flag == false) {
                    tmpOtdels[j] = this.employees[i].getOldel();
                    break;
                }
            }
        }
        return tmpOtdels;
    }
   public void getOtdelsEmployee(int[] otdels){
       int i = 0;
       while (i<otdels.length && otdels[i] != 0){
           System.out.println("Отдел - " + otdels[i]);
           this.printList(otdels[i]);
           i++;
       }
   }
}
