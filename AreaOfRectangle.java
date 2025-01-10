
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of rectangle :");
        int length = scanner.nextInt();
        
        System.out.println("Enter the width of rectangle :");
        int width = scanner.nextInt();

        double area = length * width;

        System.out.println("Area of rectangle : "+area);
        scanner.close();
    }    
}
