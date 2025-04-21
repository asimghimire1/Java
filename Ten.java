import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks of the first subject: ");
        double subject1 = sc.nextDouble();
        System.out.print("Enter the marks of the second subject: ");
        double subject2 = sc.nextDouble();
        System.out.print("Enter the marks of the third subject: ");
        double subject3 = sc.nextDouble();
        System.out.print("Enter the marks of the fourth subject: ");
        double subject4 = sc.nextDouble();

        double totalMarks = subject1 + subject2 + subject3 + subject4;
        double percentage = (totalMarks / 400) * 100;

        System.out.println("Total marks: " + totalMarks);
System.out.println("Percentage: " + percentage + "%");

String result = (percentage >= 70) ? "First Class" :
                (percentage > 59) ? "Upper Second Class" :
                (percentage > 49) ? "Second Class" :
                (percentage > 39) ? "Third Class" :
                "Fail";

System.out.println("Result: " + result);

sc.close();
    }
}
