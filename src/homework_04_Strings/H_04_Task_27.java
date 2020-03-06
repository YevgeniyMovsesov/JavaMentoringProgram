package homework_04_Strings;

public class H_04_Task_27 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "27. Дано слово. Переставить его первую букву на место k-ой.\n");

        moveFirstLetterToParticularPosition("комар", 4);
        moveFirstLetterToParticularPosition("синхрофазотрон", 2);
    }

    static void moveFirstLetterToParticularPosition (String string, int position) {
        System.out.println(String.format("   До преобразования : %s", string));
        String firstLetter = string.substring(0,1);
        String kLetter = string.substring(position-1,position);

        String symbolsBeforeLetter = string.substring(1,position-1);
        String symbolsAfterLetter = string.substring(position);
        System.out.println(String.format("После преобразования : %s",
                kLetter+symbolsBeforeLetter+firstLetter+symbolsAfterLetter));

    }
}
