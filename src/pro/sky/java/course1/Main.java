package pro.sky.java.course1;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static String kindYear(int y){
        boolean isLeapYear = (y%4==0 && y%100!=0) || y%400==0;
        if(isLeapYear){
            return "високосный год";
        }else{
            return "не високосный год";
        }
    }
    public static String kindVersionOs(int t,int y){
        String os = "";
        String version = "";
        int currentYear = LocalDate.now().getYear();
        if (y < currentYear) {
            version = "lite";
            if (t == 1) {
                os = "Android";
            } else if (t == 0) {
                os = "iOS";
            }
        } else version = "обычную";
        if (t == 1) {
            os = "Android";
        } else if (t == 0) {
            os = "iOS";
        }
        return "Установите " + version + " версию " + os;
    }
    public static int deliveryDay(int d){
        int day = 0;
        if (d <= 20)
            day = 1;
        else if (d > 20 && d < 60)
            day = 2;
        else if (d >= 60 && d <= 100)
            day = 3;
        return day;
    }
    public static void validText(String str){
        String message = "Нет дублей";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                message = "Дублирутся '" + str.charAt(i) + "' символы " + i + " и " + (i+1);
                break;
            }
        }
        System.out.println(message);
    }
    public static void reversArr(int[] arr){
        if(arr.length%2==0){
            for(int i = 0;i<arr.length/2;i++){
                change(arr, i, ((arr.length - 1) - i));
            }
        }else {
            for (int i = 0; i != (arr.length - 1) - i; i++) {
                change(arr, i, ((arr.length - 1) - i));
            }
        }
    }
    public static void change(int[] arr,int e1,int e2){
        arr[e1] = arr[e1]+arr[e2];;
        arr[e2] = arr[e1]-arr[e2];
        arr[e1] = arr[e1]-arr[e2];
    }
    public static double argSalary(int[] arr){
        double arg = 0;
        int sum = sum(arr);
        arg = sum/arr.length;
        return arg;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        // work 1
        int year = 2021;
        System.out.println(year + "-" + kindYear(year));

        // work 2
        int version = 1;
        int curYear = 2015;
        System.out.println(kindVersionOs(version,curYear));

        // work 3
        int deliveryDistance = 25;
        System.out.println("Потребуется дней: "+deliveryDay(deliveryDistance));

        // work 4
        String str = "aabccddefgghiijjkk";
        validText(str);

        // work 5
        int[] arr = {3, 2, 1, 6, 5};
        reversArr(arr);
        System.out.println(Arrays.toString(arr));

        // work 6
        int[] arrSalary = generateRandomArray();
        System.out.println(argSalary(arrSalary));
    }
}
