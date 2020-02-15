package homework_03;

public class Main {
    public static void main(String[] args) {

        H_03_Task_01 task1 = new H_03_Task_01();
        task1.run();
        H_03_Task_02 task2 = new H_03_Task_02();
        task2.run();
        H_03_Task_03 task3 = new H_03_Task_03();
        task3.run();
        H_03_Task_04 task4 = new H_03_Task_04();
        task4.run();
        H_03_Task_05 task5 = new H_03_Task_05();
        task5.run();
        H_03_Task_06 task6 = new H_03_Task_06();
        task6.run();
        H_03_Task_07 task7 = new H_03_Task_07();
        task7.run();

        H_03_Task_08 task8 = new H_03_Task_08();
        task8.run();
    }

    public static final String taskDelimiter = "------------------------------------------------------------------------\n";

    public static int[] createArrayOfRandomInt(int length, int leftBoundary, int rightBoundary) {
        int[] arr = new int[length];
        for (int i = 0; i<=arr.length-1; i++){
            arr[i]=(int) (Math.random() * (rightBoundary - leftBoundary) + leftBoundary);
        }
        return arr;
    }

    public static void showArray(int[] arr, String howToShow) {
        String delimiter = " ";
        String outputLine = "";
        switch (howToShow){
            case ("in one column"):
                delimiter = "\n";
            case ("in one line"):
                for (int j=0; j<=arr.length-1; j++){
                    outputLine = String.format("%s%d", outputLine, arr[j]);
                    if (j!=arr.length-1) outputLine = outputLine+delimiter;
                }
                break;
            case ("in one line in reversed order"):
                for (int j=arr.length-1; j>=0; j--){
                    outputLine = String.format("%s%d", outputLine, arr[j]);
                    if (j!=0) outputLine = outputLine+delimiter;
                }
                break;
        }
        System.out.println(outputLine);
    }
}
