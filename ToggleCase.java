import java.util.*;

public class ToggleCase {
    Scanner sc = new Scanner(System.in);
    String s = "";
    String r = "";

    void acc() {
        System.out.println("Enter a string:");
        s = sc.nextLine();
    }

    void calc() {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) { // if char is uppercase change to lowercase
                ch = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) { // if char is lowercase change to uppercase
                ch = Character.toUpperCase(ch);
            }
            r = r + ch; // store the new string
        }
    }

    void disp() {
        System.out.println("Toggled string: " + r);
    }

    public static void main(String[] args) {
        ToggleCase obj = new ToggleCase();
        obj.acc();
        obj.calc();
        obj.disp();
        obj.sc.close();
    }
}
