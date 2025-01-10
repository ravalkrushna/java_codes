public class GetCube {

    public static int getCube(int num){
        return num * num * num;
    }
    public static void main(String[] args) {
        int num = 10;
        int cube = GetCube.getCube(num);

        System.out.println("Cube of "+ num + " is "+ cube);

        num = 5;
        cube = GetCube.getCube(num);
        System.out.println("The cube of " + num + " is: " + cube);
    }   
}
