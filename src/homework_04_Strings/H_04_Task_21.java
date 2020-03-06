package homework_04_Strings;

public class H_04_Task_21 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "21. Дано слово. Если его длина нечетная, то удалить среднюю букву,\n" +
                "в противном случае – две средних буквы.\n");

        Main.deleteMiddleLettersAndPrintWord("Колбаса");
        Main.deleteMiddleLettersAndPrintWord("Рыба");
    }

}
