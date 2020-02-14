package Homework_03;

public class H_03_Task_03 {

    public void run() {
        System.out.println(Main.taskDelimiter+
                "3. Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.\n" +
                "Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.\n");
        int[] arrA = Main.createArrayOfRandomInt(15, 0, 9);
        Main.showArray(arrA,"in one line");
        System.out.println(String.format("В массиве %d чётных элементов",countNumberOfEvenElements (arrA)));
    }

    public int countNumberOfEvenElements (int[] arr){
        int n = 0;
        for (int j=0; j<=arr.length-1; j++){
            if (arr[j] % 2 == 0) n++;
        }

        return n;
    }

}