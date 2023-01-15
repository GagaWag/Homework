package arrays;
/*Создайте массив целых чисел.
Удалите все вхождения заданного числа из массива.
Пусть число задается с консоли (класс Scanner).
 Если такого числа нет - выведите сообщение об этом. В результате должен быть новый массив без указанного числа.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int amount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();
        for (int element : array) {
            if (element == number) {
                amount++;
            }
        }
        if (amount == 0) {
            System.out.println("Данного числа нет в массиве");
        } else {
            int newlength = array.length - amount;
            int[] array2 = new int[newlength];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] != number) {
                    array2[j] = array[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(array2));

        }
    }
}
