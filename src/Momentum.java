import java.util.Scanner;


public class Momentum {

    public static void main(String[] args) {
        double momentum, mass, velocity;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter object mass in kilos >> ");
        mass = s.nextDouble();
        System.out.print("Enter object velocity meters per second >> ");
        velocity = s.nextDouble();
        
        momentum = mass* velocity;
                
        System.out.println(String.format("The object's momentum is %.2f meters per second", momentum));
        System.out.println("Program ended");
    }
    
}
