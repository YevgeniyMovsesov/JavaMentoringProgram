package homework_03_Arrays;

public class H_03_Task_17 {

    public void run() {
        System.out.println(Main.taskDelimiter +
                "17. Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].\n" +
                "Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял\n" +
                "её наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять элементы\n" +
                "в рамках одной строки. Порядок остальных элементов строки неважен (т.е. можно совершить только одну перестановку,\n" +
                "а можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на экран.\n");
        int[][] arrA = Main.create2DArrayOfRandomInt(6, 7, 0, 9);
        Main.showArray(arrA);
        int max;
        int indexOfMaxElement;
        int temp;
        for (int[] row: arrA) {
            indexOfMaxElement = 0;
            max = 0;
            for (int j=0; j < arrA[0].length; j++) {
                if (max < row[j]) {
                    max = row[j];
                    indexOfMaxElement = j;
                }
            }
            // Меняем местами первый элемент и максимум
            temp = row[0];
            row[0] = row[indexOfMaxElement];
            row[indexOfMaxElement] = temp;
        }

        System.out.println("Массив после преобразования:");
        Main.showArray(arrA);

    }
}