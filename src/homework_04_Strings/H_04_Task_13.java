package homework_04_Strings;

public class H_04_Task_13 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "13. Дано предложение. Определить, есть ли в нем буквосочетания «чу» или\n" +
                "«щу». В случае положительного ответа найти также порядковый номер первой\n" +
                "буквы первого из них.\n");

        //String sentence = "Я хочу, чтобы лето не кончалось";
        String sentence = "Справжнє ім'я Майкла Щура з Телебачення Торонто це 'Роман Вінтонів'";
        System.out.println(String.format("Предложение: %s", sentence));
        sentence = sentence.toLowerCase();
        int firstPosition = -1;
        if (sentence.indexOf("чу") >= 0 ) {
            if (sentence.indexOf("щу") >= 0) {
                // Найдено и "чу" и "щу" и надо определить, кто из них раньше
                firstPosition = Math.min(sentence.indexOf("чу"), sentence.indexOf("щу"));
            } else {
                // Найдено "чу", но "щу" не найдено
                firstPosition = sentence.indexOf("чу");
            }
        } else {
            if (sentence.indexOf("щу") >= 0) {
                // Найдено "щу", но "чу" не найдено
                firstPosition = sentence.indexOf("щу");
            } else {
                System.out.println("Болтиссимо! Ни одного 'чу' или 'щу' не найдено.");
            }
        }
        if (firstPosition != -1) {
            System.out.println(String.format("Позиция первого вхождения 'чу' или 'щу': %d", firstPosition));
        }

    }

}
