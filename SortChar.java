import java.util.*;

public class SortChar {
    Scanner sc = new Scanner(System.in);
    String s = "";

    void acc() {
        System.out.println("Enter a string:");
        s = sc.nextLine();
        s = s.toLowerCase(); // changes string to lowercase for easier calculation
    }

    void sort_dis() {
        char arr[] = s.toCharArray(); // put all chars into array
        Arrays.sort(arr); // sort the array

        System.out.print("String after sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        SortChar obj = new SortChar();
        obj.acc();
        obj.sort_dis();
        obj.sc.close();
    }
}
