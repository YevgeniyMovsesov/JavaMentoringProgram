package Homework_03;

public class H_03_T_01 {
    public int arr[];

    public void run() {
        showTaskDescription();
        createArray();
        showArray("In one line");
        showArray("In one column");
    }

    public static void showTaskDescription() {
        System.out.println("1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, " +
                "отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). " +
                "Перед созданием массива подумайте, какого он будет размера.\n");
    }

    public void createArray() {
        for (int i=0; i<=20; i=i+2){
            this.arr[i]=i+2;
        }
    }

    public void showArray(String howToShow) {
        String delimiter = "";
        String outputLine = "";
        switch (howToShow){
            case ("In one line"):
                delimiter = " ";
                break;
            case ("In one column"):
                delimiter = "\n";
                break;
        }

        for (int j=0; j<=arr.length; j++){
            outputLine = outputLine+arr[j];
            if (j!=20) outputLine = outputLine+delimiter;
        }

        System.out.println(outputLine);
    }
}