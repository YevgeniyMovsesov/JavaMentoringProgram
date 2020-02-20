package homework_03;

import java.util.Scanner;

public class H_03_Task_11 {

    public void run() {
        System.out.println(Main.taskDelimiter+
                "11. Пользователь должен указать с клавиатуры чётное положительное число,\n" +
                "а программа должна создать массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.\n" +
                "После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше:\n" +
                "левой или правой, либо сообщить, что эти суммы модулей равны.\n" +
                "Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор,\n" +
                "пока не будет указано корректное значение.\n");
        System.out.println("Введите чётное положительное число как размер массива");
        boolean continueFlag = true;
        int i = 0;
        while (continueFlag) {
            Scanner myInput = new Scanner( System.in );
            i = myInput.nextInt();
            if (i < 2 && i % 2 == 1) {
                System.out.println("Требуется чётное положительное число");
            } else {
                continueFlag = false;
            }
        }
        int[] arrA = Main.createArrayOfRandomInt(i, -5, 5);
        Main.showArray(arrA,"in one line");
        analyzeBothHalfOfArray(arrA);

    }

    public void analyzeBothHalfOfArray(int[] arr) {
        int sumOfLeftHalf = 0;
        int sumOfRightHalf = 0;
        for (int j=0; j<=arr.length/2-1; j++) {
            sumOfLeftHalf = sumOfLeftHalf + arr[j];
            sumOfRightHalf = sumOfRightHalf + arr[j+arr.length/2];
        }
        if (sumOfLeftHalf > sumOfRightHalf) {
            System.out.println(String.format("Сумма левой половины больше правой (%d > %d)", sumOfLeftHalf, sumOfRightHalf));
        } else if (sumOfLeftHalf < sumOfRightHalf) {
            System.out.println(String.format("Сумма правой половины больше левой (%d > %d)", sumOfRightHalf, sumOfLeftHalf));
        } else {
            System.out.println(String.format("Сумма правой и левой половин равны (%d == %d)", sumOfRightHalf, sumOfLeftHalf));
        }
    }

}