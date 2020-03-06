package homework_04_Strings;

public class H_04_Task_15 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "15. Дано предложение. Все буквы «е» в нем заменить на буквы «и».\n");

        String sentence = "Скажи-ка, дядя, ведь не даром. Москва, спаленная пожаром, Французу отдана?";
        System.out.println(String.format("Предложение    до преобразования : %s", sentence));

        sentence = sentence.replaceAll("е", "и");

        System.out.println(String.format("Предложение после преобразования : %s", sentence));


    }

}
