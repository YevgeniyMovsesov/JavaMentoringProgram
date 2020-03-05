package homework_04_Strings;

public class H_04_Task_10 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "10. Дано предложение, в котором имеется несколько букв «е».\n" +
                "Найти порядковый номер первой из них.\n");

        String sentence = "Съешь ещё этих мягких французских булок!";
        int positionOfFirstSymbol = sentence.indexOf('е')+1;
        System.out.println(String.format("Предложение: %s", sentence));
        System.out.println(String.format("Порядковый номер первой буквы 'е': %d",
                positionOfFirstSymbol));

    }

}
