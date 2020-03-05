package homework_04_Strings;

public class H_04_Task_05 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "5. Дано предложение. Вывести все имеющиеся в нем буквосочетания «нн».\n");

        String sentence = "Макаронный монстр ненамеренно съел мозги";
        String substring = "нн";
        String allSubstrings = "";
        for (int i=0; i < Main.numberOfOccurrences(sentence, substring); i++) {
            allSubstrings = allSubstrings + substring + "\n";
        }
        System.out.println(String.format("Предложение: %s", sentence));
        System.out.println(String.format("Все буквосочетания '%s':\n%s", substring, allSubstrings));

    }

}
