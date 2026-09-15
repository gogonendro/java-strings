import java.util.*;

public class VowCons {
    Scanner sc = new Scanner(System.in);
    String s;

    VowCons() {
        s = "";
    }

    void accept() {
        System.out.println("Enter a word:");
        s = sc.next();
    }

    void CountVowCons() {
        String w = s;
        w = w.toUpperCase(); // convert the word to uppercase
        // set counters at 0
        int vc = 0;
        int cc = 0;

        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == 'A' || w.charAt(i) == 'E' || w.charAt(i) == 'I' || w.charAt(i) == 'O'
                    || w.charAt(i) == 'U') {
                vc++; // increase vowel counter when vowel found
            } else {
                cc++; // else increase cons counter
            }
        }
        System.out.println("Total number of vowels: " + vc);
        System.out.println("Total number of consonants: " + cc);

    }

    public static void main(String[] args) {
        VowCons obj = new VowCons();
        obj.accept();
        obj.CountVowCons();
        obj.sc.close();
    }
}
