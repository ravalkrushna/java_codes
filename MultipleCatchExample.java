public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 

            int result = 10 / 0; 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds!");
            System.out.println("Error Message: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed!");
            System.out.println("Error Message: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: Some other exception occurred!");
            System.out.println("Error Message: " + e.getMessage());
        } finally {
            System.out.println("Execution finished. Cleaning up resources if needed.");
        }
        
        System.out.println("Program continues...");
    }
}
