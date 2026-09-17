import java.util.*;

public class RepDel {
    Scanner sc = new Scanner(System.in);
    String s = "";
    String r = "";

    void acc() {
        System.out.println("Enter a string:");
        s = sc.nextLine();
    }

    void calc_dis() {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // stores every char in thr string
            boolean rep = false; // default false

            /*
             * runs from 0 to string r's length and sets rep to true if repeated char found,
             * else, adds the char from original string to it
             */
            for (int j = 0; j < r.length(); j++) {
                if (Character.toLowerCase(ch) == Character.toLowerCase(s.charAt(j))) {
                    rep = true;
                    break;
                }
            }
            if (!rep) {
                r = r + ch;
            }
        }

        System.out.println("After deleting repeated characters: " + r);
    }

    public static void main(String[] args) {
        RepDel obj = new RepDel();
        obj.acc();
        obj.calc_dis();
        obj.sc.close();
    }
}
