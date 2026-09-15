//tough program

import java.util.*;

public class CharFreq {
    Scanner sc = new Scanner(System.in);
    String s = "";
    int c = 0;

    void accept() {
        System.out.println("Enter a word:");
        s = sc.next();
    }

    void freq() {
        String w = s;
        for (int i = 0; i < w.length(); i++) { // runs from 0 to word's length
            char ch = w.charAt(i); // stores each char
            c = 0; // counter set to 0

            boolean rep = false; // repeated char not found yet

            for (int j = 0; j < i; j++) { // runs from 0 to the specific char
                if (w.charAt(j) == ch) { /*
                                          * if any char in that range is equal to that specific char then repeatation is
                                          * true
                                          */
                    rep = true;
                    break;
                }
            }

            if (rep == false) { // in case of non-repetative chars
                for (int j = 0; j < w.length(); j++) {
                    if (w.charAt(j) == ch) { // check if chars are same throughout the word
                        c++; // increases count if yes
                    }
                }
                System.out.println(ch + " = " + c);
            }
        }
    }

    public static void main(String[] args) {
        CharFreq obj = new CharFreq();
        obj.accept();
        obj.freq();
        obj.sc.close();
    }
}
