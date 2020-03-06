package homework_04_Strings;

public class H_04_Task_21 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "21. Дано слово. Если его длина нечетная, то удалить среднюю букву,\n" +
                "в противном случае – две средних буквы.\n");

        deleteMiddleLettersAndPrintWord("Колбаса");
        deleteMiddleLettersAndPrintWord("Рыба");
    }

    private void deleteMiddleLettersAndPrintWord (String word) {
        System.out.println(String.format("   До преобразования : %s", word));
        int letterPositionToDelete;

        if (word.length() % 2 == 0) {
            letterPositionToDelete = word.length()/2;
            word = deleteLetterFromStringByPosition (letterPositionToDelete+1, word);
            word = deleteLetterFromStringByPosition (letterPositionToDelete, word);
        } else {
            letterPositionToDelete = (word.length()-1)/2+1;
            word = deleteLetterFromStringByPosition (letterPositionToDelete, word);
        }
        System.out.println(String.format("После преобразования : %s", word));

    }

    private String deleteLetterFromStringByPosition (int letterPosition, String string) {
        String symbolsBeforeLetter = string.substring(0,letterPosition-1);
        String symbolsAfterLetter = string.substring(letterPosition);
        return symbolsBeforeLetter+symbolsAfterLetter;
    }
}
