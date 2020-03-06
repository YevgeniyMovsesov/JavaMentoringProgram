package homework_04_Strings;

public class H_04_Task_24 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "24. Дано слово. Вставить заданную букву после первой буквы «и».\n");

        insertLetterAfterParticularCharAndPrintTheWord('У', 'и', "Айболит");
        insertLetterAfterParticularCharAndPrintTheWord('У', 'и', "Тилимилитрямдия");
    }

    public void insertLetterAfterParticularCharAndPrintTheWord(char letterToInsert, char letterToSearch, String word) {
        System.out.println(String.format("   До преобразования : %s", word));
        int letterPosition = word.indexOf(letterToSearch)+1;
        String symbolsBeforeLetter = word.substring(0,letterPosition);
        String symbolsAfterLetter = word.substring(letterPosition);
        System.out.println(String.format("После преобразования : %s",
                symbolsBeforeLetter+letterToInsert+symbolsAfterLetter));

    }

}
