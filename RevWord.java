import java.util.*;

public class RevWord {
    Scanner sc = new Scanner(System.in);
    String s = "";
    String r = "";

    void acc() {
        System.out.println("Enter a sentence:");
        s = sc.nextLine();
    }

    void rev() {
        String words[] = s.split(" "); // stores every word

        for (int i = 0; i < words.length; i++) {
            String word = words[i]; // 'word' stores every word in each iteration
            String rw = "";

            for (int j = word.length() - 1; j >= 0; j--) { // reverse loop runs from end to first of the word
                rw += word.charAt(j); // appends each char in rw (hence, reversing each word)
            }
            r += rw; // adds the reversed words in a new string, preserving their place

            if (i < word.length() - 1) {
                r += " ";
            }
        }
    }

    void dis() {
        System.out.println("String with reversed words: " + r);
    }

    public static void main(String[] args) {
        RevWord obj = new RevWord();
        obj.acc();
        obj.rev();
        obj.dis();
    }
}
