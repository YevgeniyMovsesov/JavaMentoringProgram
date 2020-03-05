package homework_04_Strings;

public class Main {
    public static void main(String[] args) {
        /*
        H_04_Task_01 task1 = new H_04_Task_01();
        task1.run();
        H_04_Task_02 task2 = new H_04_Task_02();
        task2.run();
        H_04_Task_03 task3 = new H_04_Task_03();
        task3.run();
        H_04_Task_04 task4 = new H_04_Task_04();
        task4.run();
        H_04_Task_05 task5 = new H_04_Task_05();
        task5.run();
        H_04_Task_06 task6 = new H_04_Task_06();
        task6.run();
        H_04_Task_07 task7 = new H_04_Task_07();
        task7.run();
        H_04_Task_08 task8 = new H_04_Task_08();
        task8.run();
        H_04_Task_09 task9 = new H_04_Task_09();
        task9.run();
        H_04_Task_10 task10 = new H_04_Task_10();
        task10.run();
        H_04_Task_11 task11 = new H_04_Task_11();
        task11.run();
        H_04_Task_12 task12 = new H_04_Task_12();
        task12.run();
        H_04_Task_13 task13 = new H_04_Task_13();
        task13.run();
        H_04_Task_14 task14 = new H_04_Task_14();
        task14.run();
        H_04_Task_15 task15 = new H_04_Task_15();
        task15.run();
        H_04_Task_16 task16 = new H_04_Task_16();
        task16.run();
        H_04_Task_17 task17 = new H_04_Task_17();
        task17.run();
        H_04_Task_18 task18 = new H_04_Task_18();
        task18.run();
        /* */
        H_04_Task_11 task11 = new H_04_Task_11();
        task11.run();

    }

    public static final String taskDelimiter = "------------------------------------------------------------------------\n";

    public static int numberOfOccurrences(String stringToSearch, String substring) {
        int counter = 0;
        while (stringToSearch.indexOf(substring)>0) {
            stringToSearch = stringToSearch.replaceFirst(substring,"");
            counter++;
        }
        return counter;
    }


}
