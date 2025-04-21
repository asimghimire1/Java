import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + triangleArea);

        
        System.out.print("Enter the side length of the cube: ");
        double side = sc.nextDouble();
        double cubeVolume = Math.pow(side, 3);
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
