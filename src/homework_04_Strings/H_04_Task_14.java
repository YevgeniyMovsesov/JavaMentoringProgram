package homework_04_Strings;

public class H_04_Task_14 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "14. Дано предложение. Напечатать все символы, расположенные между\n" +
                "первой и второй запятой. Если второй запятой нет, то должны быть\n" +
                "напечатаны все символы, расположенные после единственной имеющейся\n" +
                "запятой.\n");

        String sentence = "Скажи-ка, дядя, ведь не даром. Москва, спаленная пожаром, Французу отдана?";
//        String sentence = "Скажи-ка, дядя";
        System.out.println(String.format("Предложение: %s", sentence));
        int firstCharPosition = sentence.indexOf(",")+1;
        int secondCharPosition = sentence.indexOf(",", firstCharPosition);
        if (secondCharPosition >= 0) {
            String outputString = sentence.substring(firstCharPosition, secondCharPosition);
            System.out.println(String.format("Символы, расположенные между первой и второй запятой: '%s'", outputString));
        } else {
            String outputString = sentence.substring(firstCharPosition);
            System.out.println(String.format("Символы, расположенные после первой запятой: '%s'", outputString));
        }
    }

}
