import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        String eligibility = (age >= 18) ? "Eligible to vote." : "Not eligible to vote.";
        System.out.println(eligibility);

        sc.close();
    }
}