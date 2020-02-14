package Homework_03;

public class H_03_Task_04 {
    int[] arr = new int[8];

    public void run() {
        showTaskDescription();
        createArray();
        showArray("in direct order");
        replaceOddElementsWithZeroes();
        showArray("in direct order");
    }

    public void showTaskDescription() {
        System.out.println("Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. " +
                "Замените каждый элемент с нечётным индексом на ноль. Снова выведите массив на экран на отдельной строке.\n");
    }

    public void replaceOddElementsWithZeroes() {
        for (int i=0; i<=arr.length-1; i++){
            if (i % 2 == 1) this.arr[i]=0;
        }
    }

    public void createArray() {
        int min = 1;
        int max = 10;

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