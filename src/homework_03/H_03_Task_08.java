package homework_03;

import java.io.IOException;

public class H_03_Task_08 {

    public void run() {
        System.out.println(Main.taskDelimiter+
                "8. Создайте массив из 12 случайных целых чисел из отрезка [-15;15].\n" +
                "Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.\n");
        boolean continueFlag = true;
        while (continueFlag) {
            int[] arrA = Main.createArrayOfRandomInt(12, -15, 15);
            Main.showArray(arrA,"in one line");
            findMaxElementAndShowItsIndex (arrA);

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

    public void findMaxElementAndShowItsIndex (int[] arr) {
        int maxElement = 0;
        int lastMaxIndex = 0;

        for (int i=0; i<=arr.length-1; i++) {
            if (maxElement <= arr[i]) {
                maxElement = arr[i];
                lastMaxIndex = i;
            }
        }

        System.out.println(String.format("Максимальным является число %d,\n" +
                "а индекс его последнего вхождения в массив: %d", maxElement, lastMaxIndex)
        );
    }

}