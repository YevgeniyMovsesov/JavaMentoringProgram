package lesson02;

public class Lesson2 {
    public static void run() {
        System.out.println("Массив длиной 10 элементов и распечатать каждый элемнт");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
            System.out.println(i);
        }
    }
}
