package Lesson01;

public class Task4 {
    public static void run (int monthNumber){
        String season = "";

        System.out.println("----------");
        System.out.println("Дано число месяца (тип int).\n" +
                "Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.");
        if (monthNumber > 0 && monthNumber <= 12 ) {
            if (monthNumber == 12 || monthNumber <= 2) {
                season = "зиме";
            } else if (monthNumber >= 3 && monthNumber <= 5) {
                season = "весне";
            } else if(monthNumber >= 6 && monthNumber <= 8) {
                season = "лету";
            } else if(monthNumber >= 9 && monthNumber <= 1) {
                season = "осени";
            };
        } else {
            System.out.println("Неизвестный номер месяца");
        };

        System.out.println("Месяц " + monthNumber + " относится к " + season);

    }
}
