package pro.sky.java.course1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    private static Employee[] employees = new  Employee[10];

    public static void addEmployee(Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null){
                employees[i] = employee;
                break;
            }
        }
    }
    public static void  printList(int otdel){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i]!=null)
                switch (otdel){
                    case -1:
                        System.out.println(employees[i].toString(false));
                    default:
                        if(employees[i].getOldel() == otdel){
                            System.out.println(employees[i].toString(true));
                        }
                }

        }
    }
    public static double getSumSalary(int otdel){
        double salary = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i]!=null) {
                if(otdel!=-1){
                   if(employees[i].getOldel() == otdel){
                       salary += employees[i].getSalary();
                   }
                }else {
                    salary += employees[i].getSalary();
                }
            }
        }
        return salary;
    }
    public static int findMinSalary(int otdel){
        int index = 0;
        for (int i = 1; i < employees.length; i++) {
            if(employees[i]!=null) {
                switch (otdel) {
                    case -1:
                        if (employees[i].getSalary() < employees[index].getSalary()) {
                            index = i;
                        }
                    default:
                        if (employees[i].getSalary() < employees[index].getSalary() && employees[i].getOldel() == otdel) {
                            index = i;
                        }
                }
            }
        }
        return index;
    }
    public static int findMaxSalary(int otdel){
        int index = 0;
        for (int i = 1; i < employees.length; i++) {
            if(employees[i]!=null) {
                switch (otdel) {
                    case -1:
                        if (employees[i].getSalary() > employees[index].getSalary()) {
                            index = i;
                        }
                    default:
                        if (employees[i].getSalary() > employees[index].getSalary() && employees[i].getOldel() == otdel) {
                            index = i;
                        }
                }
            }
        }
        return index;
    }
    public static double averageSalary(int otdel){
        double salary = 0;
        int cnt = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i]!=null) {
                switch (otdel){
                    case -1:
                        salary += employees[i].getSalary();
                        cnt++;
                    default:
                        if(employees[i].getOldel() == otdel){
                            salary += employees[i].getSalary();
                            cnt++;
                        }
                }
            }
        }
        return salary/cnt;
    }
    public static void printFio(){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i]!=null)
                System.out.println(employees[i].getFio());
        }
    }
    public static void printMessage(String message,int item){
        System.out.println(message+employees[item].getSalary()+", сотрудник: " + employees[item].getFio());
    }
    public static void indexSalary(int procent,int otdel){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i]!=null)
                switch (otdel){
                    case -1:
                        employees[i].setSalary(employees[i].getSalary()+((employees[i].getSalary()/100)*procent));
                    default:
                        if(employees[i].getOldel() == otdel){
                            employees[i].setSalary(employees[i].getSalary()+((employees[i].getSalary()/100)*procent));
                        }
                }
        }
    }
    public static void listEmloyeeConditional(int flag,double salary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                switch (flag) {
                    case 1:
                        if (employees[i].getSalary() < salary)
                            System.out.println(employees[i].toString(true));
                        break;
                    case 2:
                        if (employees[i].getSalary() > salary)
                            System.out.println(employees[i].toString(true));
                        break;
                    case 3:
                        if (employees[i].getSalary() == salary)
                            System.out.println(employees[i].toString(true));

                }
            }
        }
    }
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов Иван Иванович",1,100_000.34);
        Employee employee2 = new Employee("Петров Петр Петрович",1,101_000.53);
        Employee employee3 = new Employee("Вавильева Василиса Васильевна",2,100_000.34);
        Employee employee4 = new Employee("Седров Илья Петрович",3,112_000.43);
        Employee employee5 = new Employee("Прокопенко Анна Александровна",4,99_679.54);
        Employee employee6 = new Employee("Ющенко Юлия Тимофеевна",5,89_061.78);
        Employee employee7 = new Employee("Пеньков Виктор Иванович",5,142_673.34);
        Employee employee8 = new Employee("Фуньтиков Иван Александрович",2,182_109.53);
        Employee employee9 = new Employee("Драпов Денис Владимирович",3,50_992.34);
        Employee employee10 = new Employee("Сенин Николай Николаевич",3,109_987.53);
        addEmployee(employee1);
        addEmployee(employee2);
        addEmployee(employee3);
        addEmployee(employee4);
        addEmployee(employee5);
        addEmployee(employee6);
        addEmployee(employee7);
        addEmployee(employee8);
        addEmployee(employee9);
        addEmployee(employee10);

        System.out.println("---Базовый уровень--");
        printList(-1);
        System.out.println("Сумма зарплат: " + getSumSalary(-1) +" руб.");
        printMessage("Минимальная зарплата: ",findMinSalary(-1));
        printMessage("Максимальная зарплата: ",findMaxSalary(-1));
        System.out.println("Средняя заработная плата : " + averageSalary(-1) +" руб.");
        printFio();
        System.out.println("---Конец---");

        System.out.println("---Средней уровень---");
        indexSalary(13,-1);
        printList(-1);
        System.out.println(getSumSalary(2));
        printMessage("Минимальная зарплата в отделе: ",findMinSalary(3));
        printMessage("Максимальная зарплата в отделе: ",findMaxSalary(3));
        System.out.println("Средняя заработная плата отдела: " + averageSalary(3) +" руб.");
        indexSalary(13,3);
        printList(3);
        // flag = 1 меньше
        // flag = 2 больше
        // flag = 3 равно
        System.out.println("меньше");
        listEmloyeeConditional(1,100000);
        System.out.println("------");
        System.out.println("больше");
        listEmloyeeConditional(2,100000);
        System.out.println("------");
        System.out.println("равно");
        listEmloyeeConditional(3,65112.11894599999);
        System.out.println("------");
        System.out.println("---Конец---");

        System.out.println("---Сложный уровень---");
        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee(employee1);
        employeeBook.addEmployee(employee2);
        employeeBook.addEmployee(employee3);
        employeeBook.addEmployee(employee4);
        employeeBook.addEmployee(employee5);
        employeeBook.addEmployee(employee6);
        employeeBook.addEmployee(employee7);
        employeeBook.addEmployee(employee8);
        employeeBook.addEmployee(employee9);
        employeeBook.addEmployee(employee10);
        employeeBook.getOtdelsEmployee(employeeBook.distinctOtdels());

        employeeBook.deleteEmployeeByIndex(employeeBook.findByFio("Ющенко Юлия Тимофеевна"));
        employeeBook.editOtdelEmployeeByIndex(employeeBook.findById(1),10);
        employeeBook.editSalaryByIndex(employeeBook.findByFio("Драпов Денис Владимирович"),132_040);
        employeeBook.printList(-1);
        System.out.println("---Конец---");


    }
}
