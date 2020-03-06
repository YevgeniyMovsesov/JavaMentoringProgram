package homework_04_Strings;

public class H_04_Task_20 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "20. Дано слово. Удалить из него первую из букв «о», если такая есть.\n");

        String word = "Корова копытом ударила в колокол";
        String substringToDelete = "о";
        int firstPositionOfSubstring = word.indexOf(substringToDelete);
        if (firstPositionOfSubstring >= 0) {
            System.out.println(String.format("   До преобразования : %s", word));

            String symbolsBeforeLetter = word.substring(0,firstPositionOfSubstring);
            String symbolsAfterLetter = word.substring(firstPositionOfSubstring+1);

            System.out.println(String.format("После преобразования : %s", symbolsBeforeLetter+symbolsAfterLetter));
        } else {
            System.out.println(String.format("Буква '%s' не найдена. Менять в строке нечего", substringToDelete));
        }
    }

}
