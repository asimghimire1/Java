import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter firt number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        double divisionResult = (double) sum / product;

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The division of the sum and product is: " + divisionResult);

        sc.close();
    }
}
