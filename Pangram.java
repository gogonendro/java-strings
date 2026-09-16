import java.util.*;

public class Pangram {
    Scanner sc = new Scanner(System.in);
    String s = "";

    boolean isPan(String x) {
        x = x.toUpperCase();
        int count[] = new int[26]; /*
                                    * array of 26 elements to store the number of occurrences of each letter from
                                    * A-Z
                                    */
        for (int i = 0; i < x.length(); i++) { // runs from 0 to string's length
            char ch = x.charAt(i); // stores every char in each iteration
            if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++; // increase counter for that specific letter if its between A-Z
            }
        }
        for (int i = 0; i < 26; i++) { // runs from 0 to 26(no. of letters in English alphabet)
            if (count[i] == 0) { /*
                                  * if no. of a letter is 0 then return false because every letter must occur
                                  * atleast once to be a pangram
                                  */
                return false;
            }
        }
        return true; // otherwise return true
    }

    void acc_disp() {
        System.out.println("Enter a string:");
        s = sc.nextLine();

        if (isPan(s)) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }

    public static void main(String[] args) {
        Pangram obj = new Pangram();
        obj.acc_disp();
        obj.sc.close();
    }
}
