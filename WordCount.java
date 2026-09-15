import java.util.*;

public class WordCount {
    Scanner sc = new Scanner(System.in);
    String s;
    int c = 0;

    void accept() {
        System.out.println("Enter a sentence:");
        s = sc.nextLine();
    }

    void calc() {
        String a = s;
        a = a + " "; // add a space after the sentence
        c = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                c++; // counts when a space is found
            }
        }
    }

    void display() {
        System.out.println("Number of words: " + c);
    }

    public static void main(String[] args) {
        WordCount obj = new WordCount();
        obj.accept();
        obj.calc();
        obj.display();
        obj.sc.close();
    }
}
