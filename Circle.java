import java.util.Scanner;

public class Circle{
    // int radius , diameter;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        
        // Circle circle = new Circle();
        System.out.println("Enter the diameter of circle");
        int diameter = scanner.nextInt();

        int radius = diameter / 2;

        System.out.println("Radius of circle is "+radius);
        scanner.close();
    }
}