package homework_04_Strings;

public class H_04_Task_18 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "18. Дано слово. Удалить из него третью букву.\n");

        String word = "Абракадабра";
        int letterPositionToDelete = 3;
        System.out.println(String.format("   До преобразования : %s", word));

        String symbolsBeforeLetter = word.substring(0,letterPositionToDelete-1);
        String symbolsAfterLetter = word.substring(letterPositionToDelete);

        System.out.println(String.format("После преобразования : %s", symbolsBeforeLetter+symbolsAfterLetter));

    }

}
