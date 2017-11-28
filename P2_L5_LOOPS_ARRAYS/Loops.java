import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String invoer = in.next();
        while (!invoer.equals("exit")) {
            System.out.println("WHILE: " + invoer);
            invoer = in.next();
        }
        System.out.println("Bye Bye While loop");

        do {
            System.out.println("DO WHILE: " + invoer);
            invoer = in.next();
        } while (!invoer.equals("exit"));
        System.out.println("Leaving Do While loop");


    }

}
