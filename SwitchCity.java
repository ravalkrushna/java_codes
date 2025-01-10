
import java.util.Scanner;

public class SwitchCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the city name: ");
        String city = scanner.nextLine();

        switch(city.toLowerCase()){
            case "ahmedabad":
                System.out.println("Hi Ahmedabad");
                break;
            case "surat":
                System.out.println("Hi surat");
                break;
            case "rajkot":
                System.out.println("Hi rajkot");
                break;
            default:
                System.out.println("Welcome to gujarat");
                break;
        }
        scanner.close();
    }
}
