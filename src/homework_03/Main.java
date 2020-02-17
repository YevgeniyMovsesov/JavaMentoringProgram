package homework_03;

public class Main {
    public static void main(String[] args) {
        /**/
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
        H_03_Task_09 task9 = new H_03_Task_09();
        task9.run();
        H_03_Task_10 task10 = new H_03_Task_10();
        task10.run();
        H_03_Task_11 task11 = new H_03_Task_11();
        task11.run();
        H_03_Task_12 task12 = new H_03_Task_12();
        task12.run();
        H_03_Task_13 task13 = new H_03_Task_13();
        task13.run();
        H_03_Task_14 task14 = new H_03_Task_14();
        task14.run();
        H_03_Task_15 task15 = new H_03_Task_15();
        task15.run();
        H_03_Task_16 task16 = new H_03_Task_16();
        task16.run();
        H_03_Task_17 task17 = new H_03_Task_17();
        task17.run();
        /* */
        H_03_Task_18 task18 = new H_03_Task_18();
        task18.run();

    }

    public static final String taskDelimiter = "------------------------------------------------------------------------\n";

    public static int[] createArrayOfRandomInt(int length, int leftBoundary, int rightBoundary) {
        int[] arr = new int[length];
        for (int i = 0; i<=arr.length-1; i++){
            //arr[i]=(int)(Math.random() * (rightBoundary - leftBoundary + 1) + leftBoundary);
                arr[i]=(int)Math.round(
                        Math.random() * (rightBoundary - leftBoundary) + leftBoundary
                );
        }
        return arr;
    }

    public static int[][] create2DArrayOfRandomInt (int rows, int columns, int leftBoundary, int rightBoundary) {
        int[][] arrA = new int[rows][columns];
        for (int i=0; i<arrA.length; i++){
            for (int j=0; j < arrA[0].length; j++) {
                arrA[i][j]=(int)Math.round(
                        Math.random() * (rightBoundary - leftBoundary) + leftBoundary
                );
            }
        }
        return arrA;
    }

    public static void showArray(double[] arr, String howToShow) {
        String outputLine = "";
        if ("in one line".equals(howToShow)) {
            for (int j = 0; j <= arr.length - 1; j++) {
                outputLine = String.format("%s%5.2f", outputLine, arr[j]);
            }
        }
        System.out.println(outputLine);
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


    public static void showArray(int[][] arr) {
        for (int[] ints : arr) {
            String outputLine = "";
            for (int j = 0; j < arr[0].length; j++) {
                outputLine = String.format("%s%4d", outputLine, ints[j]);
            }
            System.out.println(outputLine);
        }
    }
}
