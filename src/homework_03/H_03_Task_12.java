package homework_03;

import java.io.IOException;

public class H_03_Task_12 {

    public void run() {
        System.out.println(Main.taskDelimiter+
"12. Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,\n" +
"чтобы отрицательных и положительных элементов там было поровну и не было нулей.\n" +
"При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно выпадает\n" +
"сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).\n" +
"Вывести полученный массив на экран.\n");
        boolean continueFlag = true;
        while (continueFlag) {
            int[] arrA = Main.createArrayOfRandomInt(12, 1, 10);
            int[] arrB = createArrayOfNegativeModifiers(6);
            Main.showArray(arrayMultiplication(arrA, arrB),"in one line");

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

    public int[] arrayMultiplication(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        for (int i=0; i<=arr1.length-1; i++) {
            arr3[i]=arr1[i]*arr2[i];
        }
        return arr3;
    }

    public static int[] createArrayOfNegativeModifiers(int limitOfNegatives) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1};
        int numberOfNegatives = 0;
        int randomIndex;
        do {
            randomIndex =(int)Math.round(Math.random()*11);
            if (arr[randomIndex] == 1) {
                arr[randomIndex] = -1;
                numberOfNegatives++;
            }
        } while (numberOfNegatives < limitOfNegatives);
        return arr;
    }
}