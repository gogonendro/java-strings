import java.util.*;

public class Longest {
    Scanner sc = new Scanner(System.in);
    String s = "";

    void acc() {
        System.out.println("Enter a sentence:");
        s = sc.nextLine();
    }

    void calc_dis() {
        String w[] = s.split(" "); // stores the words
        String lw = "";

        for (int i = 0; i < w.length; i++) {
            String word = w[i]; // store every word for each iteration
            if (word.length() > lw.length()) {
                lw = word; // check for longest word in the array and then put it in lw
            }
        }
        System.out.println("Longest word: " + lw);
        System.out.println(lw.length() + " letters");
    }

    public static void main(String[] args) {
        Longest obj = new Longest();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
