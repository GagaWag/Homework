package arrays2;
/*Создать трехмерный массив из целых чисел.
С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[][][] array = new int[5][5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int b = 0; b < array[j].length; b++) {
                    array[i][j][b] = random.nextInt(10);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for(int b =0; b<array[j].length;b++){
                    array[i][j][b] = array[i][j][b] + number;
                }
            }}
            System.out.println(Arrays.deepToString(array));
}}
