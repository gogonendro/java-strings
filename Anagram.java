import java.util.*;

public class Anagram {
    Scanner sc = new Scanner(System.in);
    String a = "";
    String b = "";

    boolean isAnag(String x, String y) {
        if (x.length() != y.length()) {
            return false; // false if the strings' length isn't equal
        }

        // store the characters of the strings in separate arrays
        char arr1[] = x.toLowerCase().toCharArray();
        char arr2[] = y.toLowerCase().toCharArray();

        // sort the arrays alphabetically
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // returns if two arrays are equal
        return Arrays.equals(arr1, arr2);
    }

    void acc_disp() {
        System.out.println("Enter a string:");
        a = sc.nextLine();
        System.out.println("Enter another string:");
        b = sc.nextLine();

        if (isAnag(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    public static void main(String[] args) {
        Anagram obj = new Anagram();
        obj.acc_disp();
        obj.sc.close();
    }
}
