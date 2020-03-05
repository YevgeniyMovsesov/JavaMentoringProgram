package homework_04_Strings;

public class H_04_Task_02 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "2. Даны два слова (первое длиннее второго). " +
                "Заменить во втором слове соответствующее количество символов на первое слово.");
        String word1 = "Корова";
        String word2 = "ура";
        System.out.println(String.format("Слово 1 - %s", word1));
        System.out.println(String.format("Слово 2 - %s", word2));
        word2 = word1.substring(0,word2.length());
        System.out.println(String.format("Изменённое второе слово - %s", word2));

    }

}
