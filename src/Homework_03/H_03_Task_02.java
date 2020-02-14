package Homework_03;

public class H_03_Task_02 {
    int[] arr = new int[50];

    public void run() {
        showTaskDescription();
        createArray();
        showArray("in direct order");
        showArray("in reversed order");
    }

    public void showTaskDescription() {
        System.out.println("Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, " +
                "а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).\n");
    }

    public void createArray() {
        for (int i=0; i<=arr.length-1; i++){
            this.arr[i]=i*2+1;
        }
    }

    public void showArray(String howToShow) {
        String delimiter = " ";
        String outputLine = "";
        switch (howToShow){
            case ("in direct order"):
                for (int j=0; j<=arr.length-1; j++){
                    outputLine = String.format("%s%d", outputLine, arr[j]);
                    if (j!=arr.length-1) outputLine = outputLine+delimiter;
                }
                break;
            case ("in reversed order"):
                for (int j=arr.length-1; j>=0; j--){
                    outputLine = String.format("%s%d", outputLine, arr[j]);
                    if (j!=0) outputLine = outputLine+delimiter;
                }
                break;
        }
        System.out.println(outputLine);
    }
}