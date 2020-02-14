package Homework_03;

public class H_03_Task_01 {
    int[] arr = new int[10];

    public void run() {
        showTaskDescription();
        createArray();
        showArray("In one line");
        showArray("In one column");
    }

    public void showTaskDescription() {
        System.out.println("1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, " +
                "отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). " +
                "Перед созданием массива подумайте, какого он будет размера.\n");
    }

    public void createArray() {
        for (int i=0; i<=arr.length-1; i++){
            this.arr[i]=2*(i+1);
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

        for (int j=0; j<=arr.length-1; j++){
            outputLine = String.format("%s%d", outputLine, arr[j]);
            if (j!=arr.length-1) outputLine = outputLine+delimiter;
        }

        System.out.println(outputLine);
    }
}