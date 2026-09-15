import java.util.*;

public class Reverse {
    Scanner sc = new Scanner(System.in);
    String s, r;

    Reverse() {
        s = "";
        r = "";
    }

    void accept() {
        System.out.println("Enter a word:");
        s = sc.next();
    }

    void calc_dis() {
        for (int i = 0; i < s.length(); i++) {
            r = s.charAt(i) + r; // adds each charachter in front of the previous one
        }
        System.out.println("Reverse of the word: " + r);
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        obj.accept();
        obj.calc_dis();
        obj.sc.close();
    }
}
