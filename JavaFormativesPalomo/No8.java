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
public class No8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y,ctr,sum=0;
        
        System.out.println("What is the X");
        x=in.nextInt();
        System.out.println("What is the Y");
        y=in.nextInt();
        
        ctr=x+1;
       
        for (;ctr<y;ctr++) 
        {   
            
            if (ctr%3==0 || ctr%4==0)
            {
                System.out.print(ctr+", ");
                sum+=ctr;
            }
                
         
        }
        
        System.out.println("The sum of no.s "+sum);
    }
}
