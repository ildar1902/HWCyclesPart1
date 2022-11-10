public class Main {
    public static void main(String[] args) {

        //ДЗ-1.

        //Задание 1.
        System.out.println("Циклы ч.1. ДЗ-1. Задача 1.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); }

        //Задание 2.
        System.out.println("Циклы ч.1. ДЗ-1. Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i); }

        //Задание 3.
        System.out.println("Циклы ч.1. ДЗ-1. Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i); }

        //Задание 4.
        System.out.println("Циклы ч.1. ДЗ-1. Задача 4");
        for (int i = 10; i >= -10; i-- ) {
            System.out.println(i); }

        //ДЗ-2.

        //Задание 1.
        System.out.println("Циклы ч.1. ДЗ-2. Задача 1");
        for (int i = 1904; i <= 2096; i = i +4) {
            System.out.println(i + " год является високосным!"); }

        //Задание 2.
        System.out.println("Циклы ч.1. ДЗ-2. Задача 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i); }

        //Задание 3.
        System.out.println("Циклы ч.1. ДЗ-2. Задача 3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i); }

        //ДЗ-3.

        //Задание 1.
        System.out.println("Циклы ч.1. ДЗ-3. Задача 1");
      int depositAmount1 = 29000;
       int AmountOfSavings1 = 0;
        for (int i = 1; i <= 12; i++) {
          AmountOfSavings1 = AmountOfSavings1 + depositAmount1;
           System.out.println("Месяц " + i + " сумма накоплений равна " + AmountOfSavings1 + " рублей"); }

        //Задание 2.
        System.out.println("Циклы ч.1. ДЗ-3. Задача 2");
        int depositAmount = 29000;
        int AmountOfSavings = 0;
        for (int i = 1; i <= 12; i++) {
            AmountOfSavings = AmountOfSavings + AmountOfSavings / 100;
            AmountOfSavings = AmountOfSavings + depositAmount;
            System.out.println("Месяц " + i + " сумма накоплений равна " + AmountOfSavings + " рублей"); }




    }
}