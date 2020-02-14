package Homework_03;

public class H_03_Task_02 {
    int[] arr = new int[50];

    public void run() {
        System.out.println(Main.taskDelimiter+
                "2. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,\n" +
                "а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).\n");
        createArray();
        Main.showArray(arr,"in one line");
        Main.showArray(arr,"in one line in reversed order");
    }

    public void createArray() {
        for (int i=0; i<=arr.length-1; i++){
            this.arr[i]=i*2+1;
        }
    }

}