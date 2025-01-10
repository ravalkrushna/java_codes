import java.util.Scanner;
public class IfElseLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total , sub1 , sub2 , sub3;
        double percentage;
        System.out.println("Enter the marks of first subject");
        sub1 = scanner.nextInt();
        System.out.println("Enter the marks of second subject");
        sub2 = scanner.nextInt();
        System.out.println("Enter the marks of third subject");
        sub3 = scanner.nextInt();
        total = sub1 + sub2 + sub3;
        percentage = (total / 300.0) * 100;
        System.out.println("Your total is "+total);
        System.out.println("Your percentage is "+percentage);
        if(percentage > 90 && percentage < 100){
            System.out.println("Excellent");
        }else if(percentage > 80 && percentage < 90){
            System.out.println("Very Good");
        }else if(percentage > 70 && percentage < 80){
            System.out.println("Good");
        }else{
            System.out.println("Koi na"); 
        }
        scanner.close();
    }
}
