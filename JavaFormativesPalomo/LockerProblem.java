/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class LockerProblem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int st,sum=0,ch=0,term=0;
        
        System.out.print("How many lockers are there?: ");
        st=in.nextInt();
        System.out.print("The locker numbers are: \n");

        for (int i = 1; i<=st; i++)
        {
                ch=0;
                for (int c = 1; c<=i; c++)
                { 
                    if (i%c==0)
                    ch++;
                }
                if (ch%2!=0)
                {
                    term++;
                    System.out.println("term "+term+" is "+i);
                    sum++;
                }
        } 
        System.out.println("The total sum of lockers open are: "+sum);
    }
    
}
