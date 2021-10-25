package pro.sky.java.course1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // work 1
        String firstName = "Артём";
        String middleName = "Сергеевич";
        String lastName = "Коломейцев";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        //work 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();

        //work 3
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName.replace(" ","; "));
        System.out.println();

        //work 4
        if(fullName.contains("ё"))
            fullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
        System.out.println();

        //work 5
        fullName = fullName.trim();
        boolean goodString = fullName.indexOf(" ")>-1 && fullName.lastIndexOf(" ")>-1 && fullName.indexOf(" ")!=fullName.lastIndexOf(" ");
        if(goodString){
            lastName =  fullName.substring(0,fullName.indexOf(" "));
            firstName = fullName.substring(fullName.indexOf(" ")+1,fullName.lastIndexOf(" "));
            middleName = fullName.substring(fullName.lastIndexOf(" ")+1);

            System.out.println("Имя сотрудника — " + firstName);
            System.out.println("Фамилия сотрудника — " + lastName);
            System.out.println("Отчество сотрудника — " + middleName);

        } else {
            System.out.println("Строка задана не верно");
        }
        System.out.println();

        //work 6
        fullName = lastName.toLowerCase() + " " + firstName.toLowerCase() + " " + middleName.toLowerCase();
        goodString = fullName.indexOf(" ")>-1 && fullName.lastIndexOf(" ")>-1 && fullName.indexOf(" ")!=fullName.lastIndexOf(" ");
        if(goodString){
            char[] arrayFullName = fullName.toCharArray();
            int indexName = fullName.indexOf(" ")+1;
            int indexMiddleName = fullName.lastIndexOf(" ")+1;
            String newfullName = String.valueOf(arrayFullName[0]).toUpperCase() + fullName.substring(1,fullName.indexOf(" "));
            newfullName = newfullName + " "  + String.valueOf(arrayFullName[indexName]).toUpperCase() + fullName.substring(fullName.indexOf(" ")+2,fullName.lastIndexOf(" "));
            newfullName = newfullName + " "  + String.valueOf(arrayFullName[indexMiddleName]).toUpperCase() + fullName.substring(fullName.lastIndexOf(" ")+2);
            fullName = newfullName;
            System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв —  " + fullName);
        } else {
            System.out.println("Строка задана не верно");
        }
        System.out.println();

        //work 7
        StringBuilder firstStr = new StringBuilder("135");
        StringBuilder secondStr = new StringBuilder("246");
        String newString = "";
        for(int i=0;i<firstStr.length();i++){
            newString = newString + String.valueOf(firstStr.charAt(i)) + String.valueOf(secondStr.charAt(i));
        }
        System.out.println(newString);

        //work 8
        String str = "aabccddefgghiijjkk";
        String newStr = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i+1)){
                newStr = newStr + String.valueOf(str.charAt(i));
                i++;
            }
        }
        System.out.println(newStr);

    }
}
