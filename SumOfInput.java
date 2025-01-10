
import java.util.Scanner;

public class SumOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number for addition : ");
        int number = scanner.nextInt();
        
        int sum=0;
        while(number != 0){
            sum = sum + number % 10;
            number /= 10;
        }

        System.out.println("The addition is : "+sum);
        scanner.close();
    }
}
