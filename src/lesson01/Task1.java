package lesson01;

public class Task1 {
    public static void run(int a, int b, int c, int d) {
        System.out.println("----------");
        System.out.println("Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.");
        System.out.println("Вывести на консоль количество максимальных чисел среди этих четырех.");

        int min;
        min = Math.min(a,b);

        if (c < min) {
            min = c;
        }

        if (d < min) {
            min = d;
        }

        int numberOfMaximums = 0;
        int max = 0;
        int[] arr = new int[4];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;

        for (int i = 0; i <= 3; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int j = 0; j <= 3; j++) {
            if (arr[j] == max) {
                numberOfMaximums++;
            }
        }
        System.out.println("\nНаименьшим из чисел [" + a + ", " + b + ", " + c + ", " + d + "] является " + min);
        System.out.println("Обнаружено максимальных чисел = " + numberOfMaximums);

    }

}
