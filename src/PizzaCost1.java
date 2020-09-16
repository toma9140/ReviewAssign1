import java.util.Scanner;

public class PizzaCost1 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double labour = 1.5;
        final double heat = 0.75;
        double size;
        int toppings;
        
        System.out.print("How big do you wan your pizza to be? (Small Medium Large) >> ");
        size = s.nextDouble();
        System.out.print("How many toppings do you want? >> ");
        toppings = s.nextInt();
    }
    
    
    
}
