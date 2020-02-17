package homework_03;

public class H_03_Task_16 {

    public void run() {
        System.out.println(Main.taskDelimiter +
                "16. Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].\n" +
                "Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.\n" +
                "Если таких строк несколько, то вывести индекс первой встретившейся из них.\n");
        int[][] arrA = Main.create2DArrayOfRandomInt(7, 4, -5, 5);
        Main.showArray(arrA);
        int currentProduct;
        int[] rowProducts = new int[arrA.length];
        int max=0;
        for (int i = 0; i < arrA.length; i++) {
            currentProduct = 1;
            for (int j = 0; j < arrA[0].length; j++) {
                currentProduct = currentProduct * Math.abs(arrA[i][j]);
            }
            rowProducts[i] =currentProduct;
        }

        int indexOfRowWithMaxAbsProduct=0;
        for (int k=0; k < rowProducts.length; k++) {
            if (max < rowProducts[k]) {
                max = rowProducts[k];
                indexOfRowWithMaxAbsProduct = k;
            }
        }

        System.out.println(String.format("Индекс строки с наибольшим по модулю произведением элементов: %d",
                indexOfRowWithMaxAbsProduct));
    }
}