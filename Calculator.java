public class Calculator {

    public int addition(int num1 , int num2){
        return num1 + num2;
    }
    public int addition(int num1 , int num2 , int num3){
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        int twosum = calc.addition(10,10);
        System.out.println("Sum of two number is " + twosum);

        int threesum = calc.addition(10,10,10);
        System.out.println("Sum of three numbers is " + threesum);
    }
}
