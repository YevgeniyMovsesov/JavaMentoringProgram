package homework_03;

public class H_03_Task_01 {
    final int[] arr = new int[10];

    public void run() {
        System.out.println(Main.taskDelimiter+
                "1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,\n" +
                "отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).\n" +
                "Перед созданием массива подумайте, какого он будет размера.\n");
        createArray();
        Main.showArray(arr,"in one line");
        Main.showArray(arr,"in one column");
    }

    public void createArray() {
        for (int i=0; i<=arr.length-1; i++){
            this.arr[i]=2*(i+1);
        }
    }

}