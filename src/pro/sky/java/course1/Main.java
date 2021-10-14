package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        //work 1
        int i = 0;
        while(i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for(;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();

        //work 2
        int startFriday = 1;
        for(;startFriday<31;startFriday+=7){
            System.out.println("Сегодня пятница, " + startFriday + " число. Необходимо подготовить отчет.");
        }

        //work 3

        int period = 79;
        int startYear = 2021;
        int backYear = 0;
        int minYear = 0;
        do{
            backYear+=79;
        }while(backYear+79<200);
        minYear = startYear-backYear;
        for(;minYear<=startYear+period;minYear+=period){
            if(minYear!=startYear)
                System.out.println(minYear);
        }

        //work 4
        for(i=1;i<=30;i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + ": ping pong");
            else if (i % 3 == 0)
                System.out.println(i + ": ping");
            else if (i % 5 == 0)
                System.out.println(i + ": pong");
            else {
                System.out.println(i + ":");
            }
        }
        //work 5
        int numberFirst = 0;
        int numberSecond = 1;
        for(i=0;i<5;i++){
           System.out.print(numberFirst+" "+numberSecond+" ");
           numberFirst = numberFirst+numberSecond;
           numberSecond = numberFirst+numberSecond;
        }
    }
}
