import java.util.*;

public class WordFreq {
    Scanner sc = new Scanner(System.in);
    String s = "";
    int c = 0;

    void acc() {
        System.out.println("Enter a sentence:");
        s = sc.nextLine();
    }

    void freq() {
        String ws[] = s.split(" ");

        for (int i = 0; i < ws.length; i++) { // runs from 0 to every word
            c = 0;
            String w = ws[i];
            boolean rep = false;

            for (int j = 0; j < i; j++) {
                if (ws[j].equals(w)) { // checks if the current word is equal to any word from 0 to that word
                    rep = true;
                    break;
                }
            }

            if (rep == false) {
                for (int j = 0; j < ws.length; j++) {
                    if (ws[j].equals(w)) { /*
                                            * checks which word is equal to the current word in the first loop, and
                                            * increases counter
                                            */
                        c++;
                    }
                }
                System.out.println(w + " = " + c);
            }
        }
    }

    public static void main(String[] args) {
        WordFreq obj = new WordFreq();
        obj.acc();
        obj.freq();
        obj.sc.close();
    }
}
