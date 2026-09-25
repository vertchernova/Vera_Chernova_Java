import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String a = scn.nextLine();
        String b = scn.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
