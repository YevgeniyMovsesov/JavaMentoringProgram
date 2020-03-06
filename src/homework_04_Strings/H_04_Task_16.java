package homework_04_Strings;

public class H_04_Task_16 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "16. Дано предложение. Все пробелы в нем заменить на символ «_».\n");

        String sentence = "Як умру, то поховайте мене на могилі";
        System.out.println(String.format("Предложение    до преобразования : %s", sentence));

        sentence = sentence.replaceAll(" ", "_");

        System.out.println(String.format("Предложение после преобразования : %s", sentence));


    }

}
