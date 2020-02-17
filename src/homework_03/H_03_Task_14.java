package homework_03;

public class H_03_Task_14 {

    public void run() {
        System.out.println(Main.taskDelimiter+
            "14. Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].\n" +
                "Вывести массив на экран.\n");
        int[][] arrA = new int[8][5];
        for (int i=0; i<arrA.length; i++){
            for (int j=0; j < arrA[0].length; j++) {
                arrA[i][j] = (int)Math.round(Math.random() * (99 - 10) + 10);
            }
        }
        Main.showArray(arrA);
    }

}