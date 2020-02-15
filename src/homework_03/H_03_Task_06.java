package homework_03;

import java.io.IOException;

public class H_03_Task_06 {

    public void run() {
        System.out.println(Main.taskDelimiter+
                "6. Создайте массив из 3 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.\n" +
                "Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.\n");
        // В оригинальном задании говорилось про 4 числа, но придётся много раз повторять генерацию массива,
        // чтобы получились действительно 4 числа в строго возрастающей последовательности
        boolean continueFlag = true;
        while (continueFlag) {
            int[] arrA = Main.createArrayOfRandomInt(3, 10, 99);
            Main.showArray(arrA,"in one line");
            if (sequenceIsAscended(arrA)) {
                System.out.println("Массив является строго возрастающей последовательностью");
            } else {
                System.out.println("Массив НЕ является строго возрастающей последовательностью");
            }

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

    public boolean sequenceIsAscended(int[] arr) {
        boolean inAscensionOrder = true;
        int i = 0;
        while (inAscensionOrder && i <= arr.length-2) {
            if (arr[i] >= arr[i+1]) {
                inAscensionOrder = false;
            }
            i++;
        }
        return inAscensionOrder;
    }

}