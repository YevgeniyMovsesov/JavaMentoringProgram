package homework_03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class H_03_Task_13 {

    public void run() {
        System.out.println(Main.taskDelimiter+
            "13. Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.\n" +
            "Если пользователь ввёл неподходящее число, то программа должна просить пользователя повторить ввод.\n" +
            "Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.\n" +
            "Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.\n");
        boolean continueFlag = true;
        int n = 0;
        while (continueFlag) {
            System.out.println("Введите n > 3");
            Scanner myInput = new Scanner( System.in );
            n = myInput.nextInt();
            if (n > 3) {
                continueFlag = false;
            } else {
                System.out.println("Не, мне нужно только больше трёх. Повторяем до посинения...");
            }
        }
        int[] arrA = Main.createArrayOfRandomInt(n, 0, n);
        int[] arrB = createArrayOfEvenElements(arrA);
        Main.showArray(arrA,"in one line");
        Main.showArray(arrB,"in one line");
    }

    public static int[] createArrayOfEvenElements(int[] arrIn) {
        int[] arrOut = new int[arrIn.length];
        int j = 0;
        for (int i:arrIn) {
            // Ноль является чётным числом - https://ru.wikipedia.org/wiki/Чётность_нуля
            if (i % 2 == 0) {
                arrOut[j] = i;
                j++;
            }
        }
        return Arrays.copyOfRange(arrOut,0,j);
    }
}