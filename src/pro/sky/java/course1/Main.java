package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        //work 1

        int clientOS = 1;
        if(clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            if(clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Работаем с сайтом");
            }
        //work 2

        int clientDeviceYear = 2015;
        if(clientDeviceYear<2015){
            if(clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    } else {
                        System.out.println("Работаем с сайтом");
                    }
        } else if(clientOS == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if(clientOS == 0){
                            System.out.println("Установите версию приложения для iOS по ссылке");
                        } else {
                            System.out.println("Работаем с сайтом");
                        }

        //work 3
        int year = 1600;
        boolean isLeapYear = (year%4==0 && year%100!=0) || year%400==0;
        if(isLeapYear)
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");

        //work 4

        double deliveryDistance = 25;
        int day = 0;
        if(deliveryDistance<=20)
            day = 1;
        else if(deliveryDistance>20 && deliveryDistance<60)
                day = 2;
            else  if(deliveryDistance>=60 && deliveryDistance<=100)
                    day = 3;
        System.out.println("Потребуется дней: "+day);

        //work 5
        int monthNumber = 3;
        String season = "";
        switch (monthNumber){
            case 1:
                season = "Зима";
                break;
            case 2:
                season = "Зима";
                break;
            case 3:
                season = "Весна";
                break;
            case 4:
                season = "Весна";
                break;
            case 5:
                season = "Весна";
                break;
            case 6:
                season = "Лето";
                break;
            case 7:
                season = "Лето";
                break;
            case 8:
                season = "Лето";
                break;
            case 9:
                season = "Осень";
                break;
            case 10:
                season = "Осень";
                break;
            case 11:
                season = "Осень";
                break;
            case 12:
                season = "Зима";
                break;
            default:
                season = "Месяц задан не правильно. Сезон не определен";
        }
        System.out.println(season);

        // work 6
        int age = 36;
        double salary = 5000;
        double totalLimit = 0;

        if(salary>=50000 && salary<80000)
            totalLimit = salary*1.2;
        else if(salary>=80000)
                totalLimit = salary*1.5;
        else
            totalLimit = salary;

        if(age<=23)
            totalLimit = totalLimit*2;
        else
            totalLimit = totalLimit*3;

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + totalLimit + "рублей");

        // work 7
        double baseRate = 10;
        double wantedSum = 330_000;
        if(age<23)
            baseRate = baseRate + 1;
        else if(age<30)
            baseRate = baseRate + .5;
        if(salary>80_000)
            baseRate = baseRate - .7;
        if(baseRate/100*wantedSum/12<=salary/2)
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + salary/2 + " рублей. Платеж по кредиту " + baseRate/100*wantedSum/12 + "рублей. Одобрено.");
        else
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + salary/2 + " рублей. Платеж по кредиту " + baseRate/100*wantedSum/12 + "рублей. Отказано");
    }
}
