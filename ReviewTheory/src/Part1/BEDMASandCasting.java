package Part1;

public class BEDMASandCasting {

    public static void main(String[] args) {
        int x = 22;
        int y = x * 2;
        double z = (double)y/7;
         System.out.println("x is " + x);
         System.out.println("y is " + y);
         System.out.println("z is " + z);
         
         int leftover = 44 % 7;
         System.out.format("I have %d candy left over\n", leftover);
         
         System.out.println("\n\nBEDMAS\n======\n\n");
         int e, f, g;
         e=f=g=5;
         int ans;
         
         ans = e + f * g;
         System.out.println("ans should be 30 > " + ans);
         
         ans = (e + f) * g;
         System.out.println("ans should be 50 > " + ans);
         
         ans = e + f % g;
         System.out.println("ans should be 5 > " + ans);
         
         ans = (e + f) % g;
         System.out.println("ans should be 0 > " + ans);
         
    }
    
}
