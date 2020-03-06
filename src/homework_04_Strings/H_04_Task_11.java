package homework_04_Strings;

public class H_04_Task_11 {
    void run() {
        System.out.println(Main.taskDelimiter +
                "11. Дано слово. Проверить, является ли оно «перевертышем».\n");

        String word = "Топот";
        boolean isWordPalindrome = isPalindrome(word);
        String result = "является перевертышем";
        if (!isWordPalindrome) {
            result = "не " + result;
        }
        System.out.println(String.format("Слово '%s': %s",
                word,
                result));

    }

    public boolean isPalindrome (String line){
        line=line.toUpperCase();
        for (int i=0; i<=(int)Math.round(line.length() / 2); i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
