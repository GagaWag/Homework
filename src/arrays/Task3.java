package arrays;

import java.util.Scanner;
/*Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random().
        Пусть будет возможность создавать массив произвольного размера.
        Пусть размер массива вводится с консоли.*/

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();
        int[] a = new int[number];
        int max = a[1];
        int min = a[1];
        int mid = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (number - min));
            mid = mid + a[i];

            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Максимальное число = " + max);
        System.out.println("Минимальное число = " + min);
        System.out.println("Среднее значение = " + mid / a.length);
    }
}
