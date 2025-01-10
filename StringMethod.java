public class StringMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length()); 
        System.out.println("To lowercase"+str.toLowerCase());
        System.out.println("To uppercase"+str.toUpperCase());
        System.out.println("Character at" +str.charAt(4));
        System.out.println("trim"+str.trim());
        System.out.println("starts with "+str.startsWith("He"));
        System.out.println("index of world"+str.indexOf("d"));
    }
}
