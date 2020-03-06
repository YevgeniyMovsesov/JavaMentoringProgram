package homework_04_Strings;

public class H_04_Task_28 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "28. Дано слово. Переставить его последнюю букву на место первой.\n");

        moveLastLetterToTheFirst("комар");
        moveLastLetterToTheFirst("синхрофазотрон");
    }

    static void moveLastLetterToTheFirst (String string) {
        System.out.println(String.format("   До преобразования : %s", string));
        String symbolsBeforeLetter = string.substring(string.length()-1,string.length());
        String symbolsAfterLetter = string.substring(0,string.length()-1);
        System.out.println(String.format("После преобразования : %s",
                symbolsBeforeLetter+symbolsAfterLetter));

    }
}
