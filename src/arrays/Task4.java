package arrays;

import java.util.Arrays;
import java.util.Random;

/*Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных cтроках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).*/
public class Task4 {

    public static void main(String[] args) {
        float sumfirst = 0;
        int[] arrayfirst = new int[5];
        for (int i = 0; i < arrayfirst.length; i++) {
            Random random = new Random();
            arrayfirst[i] = random.nextInt(50);
            sumfirst = sumfirst + arrayfirst[i];
        }
        sumfirst = sumfirst / 5;
        System.out.println(Arrays.toString(arrayfirst));

        int[] arraysecond = new int[5];
        float sumsecond = 0;
        for (int i = 0; i < arraysecond.length; i++) {
            Random random = new Random();
            arraysecond[i] = random.nextInt(50);
            sumsecond = sumsecond + arraysecond[i];
        }
        sumsecond = sumsecond / 5;
        System.out.println(Arrays.toString(arraysecond));
        System.out.println("Среднее арифмитическое первого массива " + sumfirst);
        System.out.println("Среднее арифмитическое второго массива " + sumsecond);
        if (sumfirst < sumsecond) {
            System.out.println("Среднее арифмитическое первого массива меньше");
        }
        if (sumfirst > sumsecond) {
            System.out.println("Среднее арифмитическое второго массива меньше");
        }
        if (sumfirst == sumsecond) {
            System.out.println("Среднее арифмитическое первого и второго массива равны ");
        }


    }
}

