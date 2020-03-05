package homework_03_Arrays;

import java.io.IOException;

public class H_03_Task_10 {

    public void run() {
        System.out.println(Main.taskDelimiter+
                "10. Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.\n" +
                "Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.\n" +
                "Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.\n");
        boolean continueFlag = true;
        while (continueFlag) {
            int[] arrA = Main.createArrayOfRandomInt(11, -1, 1);
            Main.showArray(arrA,"in one line");
            analyzeFrequencyOfArrayElements(arrA);

            System.out.println("Нажмите ENTER, чтобы сгенерировать ещё массив или любую иную клавишу и ENTER, чтобы закончить");
            try {
                Character tmp = (char) System.in.read();
                if (!tmp.equals('\n')) {
                    continueFlag = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void analyzeFrequencyOfArrayElements(int[] arr1) {
        int[][] frequenciesOfNumbers = {{-1, 0, 1},{0,0,0}};
        int maxFrequency = 0;
        int indexOfMaxFrequency = 0;
        for (int i:arr1) {
            switch (i){
                case -1:
                    frequenciesOfNumbers[1][0]++;
                    break;
                case 0:
                    frequenciesOfNumbers[1][1]++;
                    break;
                case 1:
                    frequenciesOfNumbers[1][2]++;
                    break;
            }
        }
        for (int j=0; j<=2; j++) {
            if (maxFrequency < frequenciesOfNumbers[1][j]) {
                maxFrequency = frequenciesOfNumbers[1][j];
                indexOfMaxFrequency = j;
            }
        }
        //"Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.\n");
        boolean thereAreTheSameFrequencies = false;
        if (frequenciesOfNumbers[1][0] == frequenciesOfNumbers[1][1] ||
                frequenciesOfNumbers[1][0] == frequenciesOfNumbers[1][2] ||
                frequenciesOfNumbers[1][1] == frequenciesOfNumbers[1][2]
        ) {
            thereAreTheSameFrequencies = true;
        }

        if (!thereAreTheSameFrequencies) {
            System.out.println(String.format(
                    "Чаще всего (%d раз) встречается элемент %d", maxFrequency, frequenciesOfNumbers[0][indexOfMaxFrequency])
            );
        }
    }

}