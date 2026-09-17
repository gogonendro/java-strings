import java.util.*;

public class Shortest {
    Scanner sc = new Scanner(System.in);
    String s = "";

    void acc() {
        System.out.println("Enter a sentence:");
        s = sc.nextLine();
    }

    void calc_dis() {
        String w[] = s.split(" "); // stores the words
        String sw = w[0]; // stores first word as shortest by default

        for (int i = 0; i < w.length; i++) {
            String word = w[i]; // store every word for each iteration
            if (word.length() < sw.length()) {
                sw = word; // check for shortest word in the array and then put it in sw
            }
        }
        System.out.println("Shortest word: " + sw);
        System.out.println(sw.length() + " letters");
    }

    public static void main(String[] args) {
        Shortest obj = new Shortest();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
