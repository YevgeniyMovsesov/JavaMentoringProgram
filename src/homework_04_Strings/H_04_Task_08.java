package homework_04_Strings;

import java.util.Scanner;

public class H_04_Task_08 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "8. Дано предложение. Определить число вхождений в него некоторого\n" +
                "буквосочетания из двух букв.\n");

        String sentence = "Макаронный монстр ненамеренно съел мозги коровы";
        System.out.println("Введите буквосочетание из двух букв.");
        Scanner myInput = new Scanner( System.in );
        String substring = myInput.next();

        System.out.println(String.format("Предложение: %s", sentence));
        System.out.println(String.format("Число вхождений буквосочетания '%s' составляет %d",
                substring,
                Main.numberOfOccurrences(sentence, substring)));

    }

}
