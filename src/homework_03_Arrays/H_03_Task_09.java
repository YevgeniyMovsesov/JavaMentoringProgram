package homework_03_Arrays;

public class H_03_Task_09 {

    public void run() {
        System.out.println(Main.taskDelimiter+
        "9. Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.\n" +
        "Каждый элемент с i-ым индексом третьего массива должен равняться\n" +
        "отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.\n" +
        "Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.\n");
        int[] arrA = Main.createArrayOfRandomInt(10, 1, 9);
        int[] arrB = Main.createArrayOfRandomInt(10, 1, 9);
        Main.showArray(arrA,"in one line");
        Main.showArray(arrB,"in one line");
        generateAndShowThirdArray(arrA, arrB);
    }

    public void generateAndShowThirdArray(int[] arr1, int[] arr2) {
        int numberOfIntElements = 0;
        double[] arr3 = new double[arr1.length];
        for (int i = 0; i<=arr1.length-1; i++) {
            arr3[i] = (double)arr1[i]/arr2[i];
            if (arr1[i] % arr2[i] == 0) {
                numberOfIntElements++;
            }
        }
        Main.showArray(arr3,"in one line");
        System.out.println(String.format(
                "Количество целых элементов в третьем массиве: %d",
                numberOfIntElements)
        );
    }

}