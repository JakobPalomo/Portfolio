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
public class No5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=0,y=0,z=0,ctr=0,a,b,i,t,Ctr;
        
        
        System.out.println("What is the a value?");
        a=in.nextDouble();
        Ctr=a;
        System.out.println("What is the b value?");
        b=in.nextDouble();
        System.out.println("What is the i value?");
        i=in.nextDouble();
        System.out.println("What is the t value?");
        t=in.nextDouble();
        t=Math.toRadians(t);
        
        System.out.println("X         Y         Z");
        for (;Ctr<=b;Ctr=Ctr+i) 
        {            
            x=Ctr;
            y=(3*Math.pow(x, 5))-(2*Math.pow(x, 3))+x;
            z=(y*Math.sin(t))+(0.6*Math.pow(x, 2));
            System.out.printf("%.2f     "+"%.2f     "+"%.2f     %n",x,y,z);
            
            
        }
    }
    
}
