import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();
        double squareArea = side * side;
        double squarePerimeter = 4 * side;
        System.out.println("The area of the square is: " + squareArea);
        System.out.println("The perimeter of the square is: " + squarePerimeter);

        System.out.print("Enter the principal amount for Simple Interest: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);

        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + triangleArea);

        System.out.print("Enter the side length of the cube: ");
        double cubeSide = sc.nextDouble();
        double cubeVolume = Math.pow(cubeSide, 3);
        System.out.println("The volume of the cube is: " + cubeVolume);

        System.out.print("Enter the length of the cuboid: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double cuboidHeight = sc.nextDouble();
        double cuboidVolume = length * width * cuboidHeight;
        System.out.println("The volume of the cuboid is: " + cuboidVolume);

        sc.close();
    }
}