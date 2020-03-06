package homework_04_Strings;

public class H_04_Task_25 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "25. Дано слово. Составить программу, которая вставляет некоторую заданную\n" +
                "букву после буквы с заданным номером.\n");

        Main.insertLetterAfterPositionAndPrintTheWord('Ь', 5, "Бутылка");
        Main.insertLetterAfterPositionAndPrintTheWord('С', 3, "Креведко");
    }

}
