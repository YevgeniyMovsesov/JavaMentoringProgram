package Homework_03;

public class H_03_Task_03 {
    int[] arr = new int[15];

    public void run() {
        showTaskDescription();
        createArray();
        showArray("in direct order");
    }

    public void showTaskDescription() {
        System.out.println("Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. " +
                "Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.\n");
    }

    public void createArray() {
        int min = 0;
        int max = 9;

        for (int i=0; i<=arr.length-1; i++){
            this.arr[i]=(int) (Math.random() * (max - min) + min);
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