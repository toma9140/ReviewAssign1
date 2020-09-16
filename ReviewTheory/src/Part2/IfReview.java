/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

import java.util.Scanner;

/**
 *
 * @author toma9140
 */
public class IfReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = s.nextInt();
        
        if(num > 7){
            System.out.println("Too high");
            num--;
        }
        else if(num <7){
            System.out.println("Too high");
            num++;
        }
        else
            System.out.println("7 is just right");
        
        System.out.println("The number is set to " + num);
        System.out.println("Enter another number ");
        int num2 = s.nextInt();
        
        int max;
        max = Math.max(num, num2);
        if(num>num2)max = num;   
        else max = num2;
        System.out.println("The higher number is " + max);
    }
    
}
