package homework_03;

public class H_03_Task_07 {

    public void run() {
        System.out.println(Main.taskDelimiter+
                "7. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.\n" +
                "Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.\n");
        int[] arrA = createFibonacciArray(20);
        Main.showArray(arrA,"in one line");
    }

    public int[] createFibonacciArray(int arrLength) {
        int[] arrB = new int[arrLength];

        for (int i=0; i<=arrLength-1; i++) {
            if (i<=1) {
                arrB[i]=1;
            } else {
                arrB[i]=arrB[i-2]+arrB[i-1];
            }

        }

        return arrB;
    }

}