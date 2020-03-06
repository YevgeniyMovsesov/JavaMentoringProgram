package homework_04_Strings;

public class H_04_Task_23 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "23. Дано слово. Вставить в него букву «т» после k-ой буквы.\n");

        Main.insertLetterAfterPositionAndPrintTheWord('т', 5, "Колбаса");
        Main.insertLetterAfterPositionAndPrintTheWord('т', 4, "Рыба");
    }

}
