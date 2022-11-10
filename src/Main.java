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

        //ДЗ-2.

        //Задание 1.
   //     System.out.println("Циклы ч.1. ДЗ-3. Задача 1");
  //    int deposiyAmount = 29000;
  //      int total = 0;
   //     for (int i = 1; i <= 12; i++) {
    //        total = total + deposiyAmount;
    //        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей"); }
 // сделал это чтобы для себя видеть полностью код предыдущей задачи и чтобы переменные не пересекались

        //Задание 2.
        System.out.println("Циклы ч.1. ДЗ-3. Задача 2");
        int deposiyAmount = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + deposiyAmount;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей"); }




    }
}