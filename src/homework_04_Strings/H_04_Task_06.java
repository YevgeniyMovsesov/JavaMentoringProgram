package homework_04_Strings;

public class H_04_Task_06 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "6. Дано предложение. Определить долю (в %) букв «а» в нем.\n");

        String sentence = "Макаронный монстр ненамеренно съел мозги";
        String substring = "а";
        double percentage = (double)Main.numberOfOccurrences(sentence, substring) / sentence.length() * 100;
        System.out.println(String.format("Предложение: %s", sentence));
        System.out.println(String.format("Доля букв '%s' составляет %.2f%%", substring, percentage));

    }

}
