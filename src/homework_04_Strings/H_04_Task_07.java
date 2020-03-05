package homework_04_Strings;

public class H_04_Task_07 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "7. Дано предложение. Определить число вхождений в него буквосочетания «ро».\n");

        String sentence = "Макаронный монстр ненамеренно съел мозги коровы";
        String substring = "ро";
        System.out.println(String.format("Предложение: %s", sentence));
        System.out.println(String.format("Число вхождений буквосочетания '%s' составляет %d",
                substring,
                Main.numberOfOccurrences(sentence, substring)));

    }

}
