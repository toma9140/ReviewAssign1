package Part1;

public class VariablesReviwe {

    public static void main(String[] args) {
        int a = 1234567890; //4 bytes
        long d = 1234567890123456789L; //8 bytes
        short c = 12345; //2 bytes
        byte b = 127; //1 byte
        
        double dbl = 45.78; //8
        float flt = 45.7F; //4
        
        char chr = 'x';
        boolean bool = true; // or false
        
        String s = "I went to school today";
        //"s" has abilities
        
        int len = s.length();
        char lett = s.charAt(7);
        String str1 = s.substring(3,8);
        String str2 = s.substring(4);
        
        System.out.println("Length of \"s\" is: " + len);
        System.out.println("character at loc 7 is " + lett);
        System.out.println("location 3 to (not includig 8:" + str1);
        System.out.println("Location 4 to the end: " + str2);
        
        System.out.println("First\t\tLast\t\tEmail Address");
        System.out.println("C:\\Documents\\Users");
        System.out.println("He went\n\nto the store");
        
    }
    
}
