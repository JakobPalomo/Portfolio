/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Generators {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int g,gs,volt;
        double gave=0;

        System.out.print("How many generators?:");
        gs=in.nextInt();
        
        for (g=1; g<=gs; g++) 
        {
            double sum=0;
            for (int v = 1; v <=3; v++) 
            {
                System.out.println("Input voltage of "+v+" time");
                volt=in.nextInt();
                sum+=volt;
            }
            double ave=0;
            ave=sum/3;
            System.out.println("The average is "+ave);
            gave+=sum;
        }
        System.out.println("The general average is "+gave/(gs*3.0));
    }
    
}
