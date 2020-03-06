package homework_04_Strings;

public class H_04_Task_12 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "12. Дано предложение. Определить количество букв «н», предшествующих первой запятой.\n");

        String sentence = "Анна-Ванна, наш отряд хочет видеть поросят!";
        int positionOfFirstComma = sentence.indexOf(',');
        String charsBeforeComma = sentence.substring(0, positionOfFirstComma);

        System.out.println(String.format("Предложение: %s", sentence));
        System.out.println(String.format("Количество букв «н», предшествующих первой запятой: %d",
                Main.numberOfOccurrences(charsBeforeComma, "н")));

    }

}
