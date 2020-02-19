import java.util.*;
/**
 * just a hangman game.
 *
 * wesley
 * v1.0
 */
public class hangman
{
    public static String phrase = "";
    char guess;
    public static void main(){
        Scanner s = new Scanner(System.in);
        String phrase = s.nextLine();
        phrase = phrase.toLowerCase();
        String under = "";
        int count = 0;

        for(int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) == ' ') {
                under += " ";
            }
            else {
                under += "_";
            }
        }
        System.out.println("\f");
        char[] answer = under.toCharArray();
        System.out.println(answer);

        while(underscoreCheck(answer) && count < 7) {
            System.out.println("enter a character");
            String g1 = s.next().toLowerCase();
            char guess = g1.charAt(0);
            boolean right = false;

            for(int i = 0; i < phrase.length(); i++) {
                if(phrase.charAt(i) == guess) {
                    answer[i] = guess;
                    right = true;
                }
            }
            if(right == false) {
                System.out.println("you imbecile, that was so moronic that it made me pitty the people that have heard you speak!");
                count ++;
            }
            if (count == 0) {
                System.out.println("|----------------");
                System.out.println("|               |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|________");
            }
            if (count == 1) {
                System.out.println("|----------------");
                System.out.println("|               |");
                System.out.println("|               O");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|________");
            }
            if (count == 2) {
                System.out.println("|----------------");
                System.out.println("|               |");
                System.out.println("|               O");
                System.out.println("|               |");
                System.out.println("|               |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|________");
            }
            if (count == 3) {
                System.out.println("|----------------");
                System.out.println("|               |");
                System.out.println("|               O");
                System.out.println("|             --|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|________");
            }
            if (count == 4) {
                System.out.println("|----------------");
                System.out.println("|               |");
                System.out.println("|               O");
                System.out.println("|             --|");
                System.out.println("|               |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|________");
            }
            if (count == 5) {
                System.out.println("|----------------");
                System.out.println("|               |");
                System.out.println("|               O");
                System.out.println("|             --|--");
                System.out.println("|               |   ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|________");
            }
            if (count == 6) {
                System.out.println("|----------------");
                System.out.println("|               |");
                System.out.println("|               O");
                System.out.println("|             --|--");
                System.out.println("|               |");
                System.out.println("|              /");
                System.out.println("|             /");
                System.out.println("|________");
            }
            if (count == 7) {
                System.out.println("|----------------");
                System.out.println("|               |");
                System.out.println("|               O");
                System.out.println("|             --|--");
                System.out.println("|               |");
                System.out.println("|             // \\");
                System.out.println("|            //   \\");
                System.out.println("|________");
            }
            System.out.println(answer);
        }
    }

    public static boolean underscoreCheck(char[] u) {
        for(char c : u) {
            if(c == '_')
                return true;
        }
        return false;
    }
}

