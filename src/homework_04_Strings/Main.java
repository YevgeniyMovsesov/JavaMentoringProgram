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
        H_04_Task_19 task19 = new H_04_Task_19();
        task19.run();
        H_04_Task_20 task20 = new H_04_Task_20();
        task20.run();
        H_04_Task_21 task21 = new H_04_Task_21();
        task21.run();
        H_04_Task_22 task22 = new H_04_Task_22();
        task22.run();
        H_04_Task_23 task23 = new H_04_Task_23();
        task23.run();
        H_04_Task_24 task24 = new H_04_Task_24();
        task24.run();
        H_04_Task_25 task25 = new H_04_Task_25();
        task25.run();
        H_04_Task_26 task26 = new H_04_Task_26();
        task26.run();
        H_04_Task_27 task27 = new H_04_Task_27();
        task27.run();
        H_04_Task_28 task28 = new H_04_Task_28();
        task28.run();
        H_04_Task_29 task29 = new H_04_Task_29();
        task29.run();
        H_04_Task_30 task30 = new H_04_Task_30();
        task30.run();
        */
        H_04_Task_30 task30 = new H_04_Task_30();
        task30.run();
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

    private static String deleteLetterFromStringByPosition(int letterPosition, String string) {
        String symbolsBeforeLetter = string.substring(0,letterPosition-1);
        String symbolsAfterLetter = string.substring(letterPosition);
        return symbolsBeforeLetter+symbolsAfterLetter;
    }


    public static void deleteMiddleLettersAndPrintWord(String word) {
        System.out.println(String.format("   До преобразования : %s", word));
        int letterPositionToDelete;

        if (word.length() % 2 == 0) {
            letterPositionToDelete = word.length()/2;
            word = deleteLetterFromStringByPosition(letterPositionToDelete+1, word);
            word = deleteLetterFromStringByPosition(letterPositionToDelete, word);
        } else {
            letterPositionToDelete = (word.length()-1)/2+1;
            word = deleteLetterFromStringByPosition(letterPositionToDelete, word);
        }
        System.out.println(String.format("После преобразования : %s", word));

    }

    public static void insertLetterAfterPositionAndPrintTheWord(char letter, int letterPosition, String word) {
        System.out.println(String.format("   До преобразования : %s", word));
        String symbolsBeforeLetter = word.substring(0,letterPosition);
        String symbolsAfterLetter = word.substring(letterPosition);
        System.out.println(String.format("После преобразования : %s",
                symbolsBeforeLetter+letter+symbolsAfterLetter));

    }

    static void swapLetterFromPositionS_ToPositionK(String string, int positionS, int positionK) {
        System.out.println(String.format("   До преобразования : %s", string));
        String letterS = string.substring(positionS-1,positionS);
        String letterK = string.substring(positionK-1,positionK);

        String symbolsBeforeLetterS = string.substring(0,positionS-1);
        String symbolsBetweenSandK = string.substring(positionS,positionK-1);
        String symbolsAfterLetterK = string.substring(positionK);
        System.out.println(String.format("После преобразования (символ %d меняем на %d) : %s",
                positionS,
                positionK,
                symbolsBeforeLetterS+letterK+symbolsBetweenSandK+letterS+symbolsAfterLetterK));

    }
}
