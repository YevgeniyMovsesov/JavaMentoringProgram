package homework_03;

public class H_03_Task_05 {

    public void run() {
        System.out.println(Main.taskDelimiter+
                "5. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,\n" +
                "выведите массивы на экран в двух отдельных строках.\n" +
                "Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов \n" +
                "это значение оказалось больше (либо сообщите, что их средние арифметические равны).\n");
        int[] arrA = Main.createArrayOfRandomInt(5, 0, 5);
        int[] arrB = Main.createArrayOfRandomInt(5, 0, 5);
        Main.showArray(arrA,"in one line");
        Main.showArray(arrB,"in one line");
        double avgA = averageOfArray(arrA);
        double avgB = averageOfArray(arrB);
        if (avgA == avgB) {
            System.out.println("Средние арифметические массивов равны");
        } else if (avgA > avgB) {
            System.out.println(
                    String.format("Среднее арифметическое массива A больше среднего арифметического массива B (%.2f > %.2f)",
                    avgA,
                    avgB));
        } else {
            System.out.println(
                    String.format("Среднее арифметическое массива B больше среднего арифметического массива A (%.2f > %.2f)",
                    avgB,
                    avgA));
        }

    }

    public double averageOfArray(int[] arr) {
        int sumOfArray = 0;
        for (int i=0; i<=arr.length-1; i++){
            sumOfArray = sumOfArray + arr[i];
        }
        return (double)sumOfArray/arr.length;
    }

}