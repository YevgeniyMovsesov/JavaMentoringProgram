package lesson04;

public class Main {
    public static void main(String[] args) {
        String s = "Lorem Ipsum";
        String asteriskString;
        //String asteriskString = s.replaceAll(".","*");
        asteriskString = "";
        for (int i=0; i<=s.length(); i++){
            asteriskString = asteriskString + "*";
        }

        System.out.println(asteriskString+s+asteriskString);

    }
}
