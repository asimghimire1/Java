import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any age:");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        String result = (age >= 18) ? "Elibile" : "Not";
        System.out.println(result);
        sc.close();

       
    }
}