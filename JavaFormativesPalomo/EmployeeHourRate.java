
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EmployeeHourRate {
    static Scanner in=new Scanner (System.in);
    public static void main(String[] args)
    {      
        int[] hour=new int[5];
        int[] salary=new int[5];
        int[] rate=new int[5];
        int i,e;
        
        for (i = 0, e= 1; i < 5; i++,e++) 
        {
            System.out.println("Hours work of employee "+e);
            hour[i]=in.nextInt();
            
            System.out.println("rate of employee "+e);
            rate[i]=in.nextInt();
            
            salary[i]=rate[i]*hour[i];
        }
        
        System.out.print("Employee no.\tHours\tRate\tSalary");
        for (i = 0,e=1; i < 5; i++,e++) 
        {
            System.out.println("");
            System.out.print(e+"\t\t");
            System.out.print(hour[i]+"\t");
            System.out.print(rate[i]+"\t");
            System.out.print(salary[i]+"\t");
        }
        System.out.println("");
    }
}
