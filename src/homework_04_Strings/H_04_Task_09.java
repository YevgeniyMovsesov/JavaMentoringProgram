package homework_04_Strings;

public class H_04_Task_09 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "9. Дано предложение. Напечатать все его символы, предшествующие первой запятой.\n");

        String sentence = "Ели мясо мужики, пивом запивали! О чем конюх говорил, они не понимали!";
        int positionOfFirstComma = sentence.indexOf(',');
        String charsBeforeComma = sentence.substring(0, positionOfFirstComma);
        System.out.println(String.format("Предложение: %s", sentence));
        System.out.println(String.format("Символы перед первой запятой: %s",
                charsBeforeComma));

    }

}
