package arrays;

import java.util.Arrays;
import java.util.Random;

/*Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных cтроках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).*/
public class Task4 {

    public static void main(String[] args) {
        int length = 5;
        float sumfirst = 0f;
        int[] arrayfirst = new int[length];
        for (int i = 0; i < arrayfirst.length; i++) {
            Random random = new Random();
            arrayfirst[i] = random.nextInt(50);
            sumfirst = sumfirst + arrayfirst[i];
        }
        sumfirst = sumfirst / length;
        System.out.println(Arrays.toString(arrayfirst));

        int[] arraysecond = new int[length];
        float sumsecond = 0f;
        Random random = new Random();
        for (int i = 0; i < arraysecond.length; i++) {
            arraysecond[i] = random.nextInt(50);
            sumsecond = sumsecond + arraysecond[i];
        }
        sumsecond = sumsecond / length;
        System.out.println(Arrays.toString(arraysecond));
        System.out.println("Среднее арифмитическое первого массива " + sumfirst);
        System.out.println("Среднее арифмитическое второго массива " + sumsecond);
        if (sumfirst == sumsecond) {
            System.out.println("Среднее арифмитическое первого и второго массива равны ");
        } else if (sumfirst < sumsecond) {
            System.out.println("Среднее арифмитическое первого массива меньше");
        } else {
            System.out.println("Среднее арифмитическое второго массива меньше");
        }


    }
}

