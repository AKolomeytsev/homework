package pro.sky.java.course1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // work 1
        int total = 0;
        for(int i=0;i<arr.length;i++){
            total = total + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        // work 2
        int maxSum = arr[0];
        int minSum = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxSum)
                maxSum = arr[i];
            else if(arr[i]<minSum)
                    minSum = arr[i];
        }

        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");

        // work 3
        double argSum = total/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + argSum + " рублей");

        // work 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int newIndex = 0;
        for(int i=1;i<reverseFullName.length+1;i++){
            newIndex = reverseFullName.length-i;
            //System.out.print(newIndex);
            System.out.print(reverseFullName[newIndex]);
        }
        System.out.println();
        System.out.println();
        //work 5

        int[][] matrixArr = new int[3][3];

        for (int i = 0; i < matrixArr.length; i++) {
            matrixArr[i][i] = 1;
            matrixArr[i][(matrixArr.length-1)-i] = 1;
        }

        for (int[] row : matrixArr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();
        // work 6
        int[] startArr = {5, 4, 3, 2, 1};
        int[] endArr = new int[5];
        for (int i = 0; i < startArr.length; i++) {
            endArr[i] = startArr[(startArr.length-1)-i];
        }
        System.out.println(Arrays.toString(startArr));
        System.out.println(Arrays.toString(endArr));
        System.out.println();
        //work 7
        //int tmpValue = 0;
        System.out.println(Arrays.toString(startArr));
        for (int i = 0; i < startArr.length / 2; i++) {
            int tmpValue = startArr[i];
            startArr[i] = startArr[(startArr.length-1)-i];
            startArr[(startArr.length-1)-i] = tmpValue;
        }
        System.out.println(Arrays.toString(startArr));
        System.out.println();
        //work 8 
        int[] nArr = {-6,2,5,-8,8,10,4,-7,12,1};
        boolean stop = false;
        for (int i = 0; i < nArr.length && !stop; i++) {
            int tmpValue = nArr[i];
            for (int j = i+1; j < nArr.length; j++) {
                if(tmpValue+nArr[i1] == -2) {
                    System.out.println(tmpValue + "+" + nArr[i1] + "=-2");
                    stop = true;
                }
            }
        }
        System.out.println();
        //work 9
        for (int i = 0; i < nArr.length; i++) {
            int tmpValue = nArr[i];
            for (int i1 = i+1; i1 < nArr.length; i1++) {
                if(tmpValue+nArr[i1] == -2)
                    System.out.println(tmpValue + "+" + nArr[i1] + "=-2");
            }
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
