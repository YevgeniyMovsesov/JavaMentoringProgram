package homework_03_Arrays;

public class H_03_Task_14 {

    public void run() {
        System.out.println(Main.taskDelimiter+
            "14. Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].\n" +
                "Вывести массив на экран.\n");
        Main.showArray(
                Main.create2DArrayOfRandomInt(8,5,10,99)
        );
    }

}