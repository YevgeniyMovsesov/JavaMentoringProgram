package homework_04_Strings;

public class H_04_Task_26 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "26. Дано слово. Переставить его первую букву на место последней.\n");

        moveFirstLetterToTheEnd("комар");
        moveFirstLetterToTheEnd("синхрофазотрон");
    }

    static void moveFirstLetterToTheEnd (String string) {
        System.out.println(String.format("   До преобразования : %s", string));
        String symbolsBeforeLetter = string.substring(1,string.length());
        String symbolsAfterLetter = string.substring(0,1);
        System.out.println(String.format("После преобразования : %s",
                symbolsBeforeLetter+symbolsAfterLetter));

    }
}
