package Part1;

public class MathClassShortcuts {

    public static void main(String[] args) {
        int x = 10;
                
         System.out.println(Math.pow(x,3));
         System.out.println(Math.sqrt(x));
         double y = 8.9876;
         System.out.println(Math.round(y));
         System.out.println(Math.max(x,y));
         
         int roll = (int)(Math.random() * 6 + 1);
         System.out.println(roll);
         
         System.out.println("\n\nSHORTCUTS\n=======");
         
         int a = 10;
         a += 10;
         System.out.println("a is " + a);
         int b = a;
         b++;
         System.out.println("b is " + b);
         a *= 2;
         System.out.println("a is " + a);
         int c = b++;
         System.out.format("c = %d and b = %d", c, b);
         int d = ++b;
         System.out.format("d = %d and b = %d", d, b);
         
    }
    
}
