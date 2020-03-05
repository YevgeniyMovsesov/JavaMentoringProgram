package homework_04_Strings;

public class H_04_Task_04 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "4. Дано предложение. Составить программу, которая печатает «столбиком»\n" +
                "все вхождения в предложение некоторого символа.\n");

        String sentence = "Как много нам открытий чудных готовит просвещенья дух!";
        char symbol = 'и';
        String columnOfChars = "";
        int columnDimension = sentence.replaceAll("[^"+symbol+"]", "").length();
        for (int i=0; i < columnDimension; i++) {
            columnOfChars = columnOfChars + symbol + "\n";
        }
        System.out.println(String.format("Предложение: %s", sentence));
        System.out.println(String.format("Столбик символов:\n%s", columnOfChars));

    }

}
