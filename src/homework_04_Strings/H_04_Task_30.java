package homework_04_Strings;

public class H_04_Task_30 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "30. Дано ошибочно написанное слово «иинформаця».\n" +
                "Путем перемещения его букв получить слово «информация».\n");

        moveLetterFromPositionS_ToPositionK("иинформаця", 2, 9);

    }

    static void moveLetterFromPositionS_ToPositionK(String string, int positionS, int positionK) {
        System.out.println(String.format("   До преобразования : %s", string));
        String letterS = string.substring(positionS-1,positionS);
        String letterK = string.substring(positionK-1,positionK);

        String symbolsBeforeLetterS = string.substring(0,positionS-1);
        String symbolsBetweenSandK = string.substring(positionS,positionK-1);
        String symbolsAfterLetterK = string.substring(positionK);
        System.out.println(String.format("После преобразования (символ %d меняем на %d) : %s",
                positionS,
                positionK,
                symbolsBeforeLetterS+symbolsBetweenSandK+letterK+letterS+symbolsAfterLetterK));

    }

}
