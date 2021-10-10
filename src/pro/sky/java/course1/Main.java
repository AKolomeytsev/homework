package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        //work 1

        byte a = 1;
        short b = 32000;
        int c = 34_000;
        long d = 10_000_000_000_000L;

        float e = 3.14f;
        double f = 3.33333333333;

        //work 2

        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float sumWeight = firstBoxer+secondBoxer;
        float diffWeight = secondBoxer - firstBoxer;
        System.out.println("Общий вес боксеров равен: " + sumWeight + " кг");
        System.out.println("Разность в весе боксеров составляет: " + diffWeight + " кг");

        //work 3

        int bananasWeight = 80;
        int bananasCount = 5;
        int milkWeight = 105;
        int milkCount = 200;
        int iceCreamWeight = 100;
        int iceCreamCount = 2;
        int eggWeight = 70;
        int eggCount = 4;

        float sumWeightMix = (bananasWeight * bananasCount) + (milkWeight * milkCount) + (iceCreamWeight * iceCreamCount) + (eggWeight * eggCount);
        float sumWeightMixKilogram = sumWeightMix/1000;
        System.out.println("Общий вес микса в граммах: " + sumWeightMix + " г");
        System.out.println("Общий вес микса в килограммах: " + sumWeightMixKilogram + " кг");

        //work 4

        int extraWeight = 7*1000;
        int stepWeight1 = 250;
        int stepWeight2 = 500;
        int step1 = extraWeight/stepWeight1;
        int step2 = extraWeight/stepWeight2;
        int avgDay = extraWeight/((stepWeight1+stepWeight2)/2);
        System.out.println("Потеря веса " + stepWeight1 + "г - " + step1 +  " дней");
        System.out.println("Потеря веса " + stepWeight2 + "г - " + step2 + " дней");
        System.out.println("Среднее количество дней:" + avgDay);

        //work 5

        double masha = 67760;
        double denis = 83690;
        double kristina = 76230;
        double mashaNew = masha + masha*.1;
        double denisNew = denis + denis*.1;
        double kristinaNew = kristina + kristina*.1;
        System.out.println("Маша теперь получает:" + mashaNew + " рублей. Годовой доход вырос на " + (mashaNew*12-masha*12) +  " рублей");
        System.out.println("Денис теперь получает:" + denisNew + " рублей. Годовой доход вырос на " + (denisNew*12-denis*12) +  " рублей");
        System.out.println("Кристина теперь получает:" + kristinaNew + " рублей. Годовой доход вырос на " + (kristinaNew*12-kristina*12) +  " рублей");

        //work 6

        int a1 = 12;
        int b1 = 27;
        int c1 = 44;
        int d1 = 15;
        int e1 = 9;
        int result = (a1 * (b1 + (c1 - d1 * e1)));
        System.out.println(result*-1);

        // work 7
        int a2 = 5;
        int b2 = 7;
        System.out.println("a = " + a2 + " b = " + b2);
        a2 = a2+b2;
        b2 = a2-b2;
        a2 = a2-b2;
        System.out.println("a = " + a2 + " b = " + b2);

        // work 8
        int x = 834;
        int y = x/10%10;

        System.out.println(y);
    }
}
