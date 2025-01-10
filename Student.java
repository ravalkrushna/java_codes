public class Student {
    private String name;
    private String rollNo;
    private static String college = "GLS University";

    public Student(String name , String rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayDetails(){
        System.out.println("Name : " +name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("College : " + college);
    }

    public static void changeCollege(String newCollege){
        college = newCollege;
    }

    public static void main(String[] args) {
        Student stu = new Student("krushna raval" , "C69");  
        Student stu1 = new Student("krushna raval" , "A48"); 
        
        System.out.println("Before Changing College");
        stu.displayDetails();

        Student.changeCollege("Nirma University");

        System.out.println("After changing college");
        stu1.displayDetails();
    }
}
