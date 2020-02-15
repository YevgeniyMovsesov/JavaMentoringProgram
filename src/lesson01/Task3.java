package lesson01;

public class Task3 {
    public static void run(String name1, String name2){
        System.out.println("----------");
        System.out.println("Даны имена 2х человек (тип String).\n" +
                "Если имена равны, то вывести сообщение о том, что люди являются тезками.\n"+
                "Первое имя - " + name1 + "\n" +
                "Второе имя - " + name2);
        if (name1.equals(name2)) {
            System.out.println("Эти люди тёзки !");
        } else {
            System.out.println("Эти люди НЕ тёзки !");
        }
    }
}
