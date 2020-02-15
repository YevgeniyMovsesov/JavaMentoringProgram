package lesson01;

public class Task2 {
    public static void run(int a, int b, int c, int d, int e) {
        int[] arr = new int[5];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;
        int min = a;
        int max = a;
        String message = "";

        for (int i = 0; i <= 4; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            message = String.format("%s%d", message, arr[i]);
            if (i < 4) {
                message = message + ", ";
            }
        }

        System.out.println("----------");
        System.out.println("Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.");
        System.out.println("\nЧисла - [" + message + "]");
        System.out.println("Наименьшее = " + min);
        System.out.println("Наибольшее = " + max);
    }
}
