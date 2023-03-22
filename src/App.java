import java.util.Scanner;

/* public class App {
    public static void main(String[] args) {
        int num = 5;
        printTable(num);
    }
    
    public static void printTable(int num) {
        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
} */

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Type a number: ");
    int num = scanner.nextInt();

    System.out.println("Multiplication table of " + num + ":");

    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + (num * i));
    }

    scanner.close();
  }
}
