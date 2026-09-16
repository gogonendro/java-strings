import java.util.*;;

public class BlankRemove {
    Scanner sc = new Scanner(System.in);
    String s = "";
    String r = "";

    void accept() {
        System.out.println("Enter a sentence:");
        s = sc.nextLine();
    }

    void calc() {
        r = s.replace(" ", ""); // replaces every instace of blank with "" (removes them)
    }

    void display() {
        System.out.println("After removing spaces: " + r);
    }

    public static void main(String[] args) {
        BlankRemove obj = new BlankRemove();
        obj.accept();
        obj.calc();
        obj.display();
        obj.sc.close();
    }
}
