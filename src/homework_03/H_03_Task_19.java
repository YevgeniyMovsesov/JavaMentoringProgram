package homework_03;

import java.util.Scanner;

public class H_03_Task_19 {

    public void run() {
        System.out.println(Main.taskDelimiter +
                "19. Вводим нечётное число, которое является длиной последней строчки треугольника Паскаля.\n" +
                "Показать треугольник Паскаля на экран.\n");
        boolean continueFlag = true;
        int n = 0;
        System.out.println("Введите нечётное число больше двух.");
        while (continueFlag) {
            System.out.println("Введите n >= 3");
            Scanner myInput = new Scanner( System.in );
            n = myInput.nextInt();
            if (n >= 3) {
                continueFlag = false;
            } else {
                System.out.println("Не, мне нужно только больше трёх. Повторяем до посинения...");
            }
        }
        String[] arrA;
        generatePascalTriangle (n);
    }

    private static void generatePascalTriangle (int n) {
        String [] arr = new String [n];
        String outputString;
        int numberOfFilledElements;
        String filledString;
        String stringOfEmptyElements;
        int numberOfLines = Math.round(n/2)+1;
        for (int i=0; i<numberOfLines; i++) {
            numberOfFilledElements = i*2 + 1;
            stringOfEmptyElements = "";
            filledString = "";
            // Формируем пустые символы слева от заполненных
            for (int j=0; j < (n - numberOfFilledElements)/2; j++) {
                stringOfEmptyElements = String.format("%s%s", stringOfEmptyElements, " ");
            }
            // Формируем заполненные символы
            for (int j=0; j<numberOfFilledElements; j++) {
                filledString = String.format("%s%s", filledString, "*");
            }
            outputString = String.format("%s%s%s\n", stringOfEmptyElements, filledString, stringOfEmptyElements);
            System.out.println(outputString);
        }
    }

}