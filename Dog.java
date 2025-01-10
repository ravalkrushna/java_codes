public class Dog {
    
    private String name;
    private String breed;
    
    Dog(String name , String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Bruno","German");
        Dog d2 = new Dog("Rocky","Rotweiler");

        d1.displayDetails();
        d2.displayDetails();

        d1.setName("name");
        d1.setBreed("breed");
        d1.displayDetails();

        d2.setName("karan");
        d2.setBreed("golden retriever");
        d2.displayDetails();
    }
}
