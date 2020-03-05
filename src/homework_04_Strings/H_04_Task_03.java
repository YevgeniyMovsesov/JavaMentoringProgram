package homework_04_Strings;

public class H_04_Task_03 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "3. Дано предложение. Напечатать все его буквы «и».\n");
        String sentence = "Как много нам открытий чудных готовит просвещенья дух!";
        String all_letters_i = "";
        all_letters_i = sentence.replaceAll("[^и]", ".");
        System.out.println(String.format("Предложение: %s", sentence));
        System.out.println(String.format("Буквы   'и': %s", all_letters_i));

    }

}
