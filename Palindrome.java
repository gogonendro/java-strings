import java.util.*;

public class Palindrome {
    Scanner sc = new Scanner(System.in);
    String s;

    Palindrome() {
        s = "";
    }

    boolean isPalin(String x) {
        String w = x;
        String r = "";
        for (int i = 0; i < w.length(); i++) {
            r = w.charAt(i) + r; // adds each charachter in front of the previous one
        }
        return r.equals(x);
    }

    void acc_calc() {
        System.out.println("Enter a word:");
        s = sc.next();

        if (isPalin(s)) {
            System.out.println(s + " is Palindrome");
        } else {
            System.out.println(s + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.acc_calc();
    }
}
