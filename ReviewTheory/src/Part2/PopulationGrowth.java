package Part2;
import java.text.NumberFormat;
import java.util.Scanner;
public class PopulationGrowth {

    public static void main(String[] args) {
        int pop = 160000;
        int growth;
        NumberFormat nf = NumberFormat.getNumberInstance();      
        
        System.out.format("%5s", "YEAR");
        System.out.format("%20s", "POPULATION");
        System.out.format("%15s", "GROWTH");
        System.out.format("%20s\n", "NEW POPULATION");
        
        System.out.format("%5s", "====");
        System.out.format("%20s", "==========");
        System.out.format("%15s", "======");
        System.out.format("%20s\n", "==============");
        
        for(int year = 2020; year <= 2120; year +=10){
            System.out.format("%5d", year);
            System.out.format("%20s", nf.format(pop));
            growth = (int)(.06 * pop);
            System.out.format("%15s", nf.format(growth));
            pop += growth;
            System.out.format("%20s\n", nf.format(pop));
        }
        
        }
    
    
}
