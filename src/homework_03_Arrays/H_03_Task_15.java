package homework_03_Arrays;

public class H_03_Task_15 {

    public void run() {
        System.out.println(Main.taskDelimiter +
"15. Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести массив на экран.\n" +
"После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).\n");
        int[][] arrA = Main.create2DArrayOfRandomInt(8, 5, -99, 99);
        Main.showArray(arrA);
        int max = 0;
        for (int[] ints : arrA) {
            for (int j = 0; j < arrA[0].length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
        }
        System.out.println(String.format("Максимальный элемент массива: %d", max));
    }
}