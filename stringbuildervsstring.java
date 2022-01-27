package src;

public class stringbuildervsstring {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Test immutability");


        String str2 = "Test immutability";

        System.out.println("String Builder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());

        // Change the values stored in each object
        str.replace(0, str.length(), "HelloWorld");
        str2 = "HelloWord";

        System.out.println("String Builder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());
    }

}
