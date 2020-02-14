package Homework_03;

public class H_03_T_02 {
    public static void run() {
        showTaskDescription();
        createAndTranformArray();
    }

    public static void showTaskDescription() {
        System.out.println("Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, " +
                "а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).");
    }

    public static void createAndTranformArray() {
        String outputLine = "";
        for (Integer i=1; i<=99; i=i+2){
            outputLine = outputLine+i.toString();
            if (i!=20) outputLine = outputLine+" ";
        }
        System.out.println(outputLine);
    }

    public static void showArrayInOneColumn() {
        String outputLine = "";
        for (Integer i=2; i<=20; i=i+2){
            outputLine = outputLine+i.toString();
            if (i!=20) outputLine = outputLine+"\n";
        }
        System.out.println(outputLine);
    }
}
