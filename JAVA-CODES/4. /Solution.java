import java.util.Scanner;

public class Santhosh {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        x = scanner.nextInt();
        System.out.print("Enter y: ");
        y = scanner.nextInt();

        System.out.println("Before Swapping");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        scanner.close();
    }
}
