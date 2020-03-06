package homework_04_Strings;

public class H_04_Task_17 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "17. Дано предложение. Заменить в нем все вхождения буквосочетания «ах» на «ух».\n");

        String sentence = "ах, у дуба, ах у ели, мы уху с тобою ели";
        System.out.println(String.format("   До преобразования : %s", sentence));

        sentence = sentence.replaceAll("ах", "ух");

        System.out.println(String.format("После преобразования : %s", sentence));


    }

}
