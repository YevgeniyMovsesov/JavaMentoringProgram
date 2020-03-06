package lesson04;

public class Main {
    public static void main(String[] args) {
        String s = "Lorem Ipsum";
        StringBuilder asteriskString;
        //String asteriskString = s.replaceAll(".","*");
        asteriskString = new StringBuilder();
        for (int i=0; i<=s.length(); i++){
            asteriskString.append("*");
        }

        System.out.println(asteriskString+s+asteriskString);

    }
}
