package arrays;

import java.util.Scanner;

public class Task1 {
    /*Создайте массив целых чисел. Напишете программу, которая выводит
            сообщение о том, входит ли заданное число в массив или нет.
            Пусть число для поиска задается с консоли (класс Scanner).*/
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                b = 1;

            }
        }
        if (b == 1) {
            System.out.println("Данное число в массиве");
        } else {
            System.out.println("Данного числа нет в массиве");
        }
    }
}
