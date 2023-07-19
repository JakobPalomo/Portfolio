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
public class Resultant {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) 
    {
        double m1,d1,m2,d2,rX,rY,dY,r;
        
        System.out.println("Input 1st magnitude");
        m1=in.nextDouble();
        m1=validateInput(m1);
        System.out.println("Input 1st direction");
        d1=in.nextDouble();
        d1=validateInput(d1);
        d1=Math.toRadians(d1);
        System.out.println("Input 2nd magnitude");
        m2=in.nextDouble();
        m2=validateInput(m2);
        System.out.println("Input 2nd direction");
        d2=in.nextDouble();
        d2=validateInput(d2);
        d2=Math.toRadians(d2);
        rX=resultantX(m1,d1,m2,d2);
        rY=resultantY(m1,d1,m2,d2);
        r=resultant(rX, rY);
        dY=direction(rX, rY);
        dY=Math.toDegrees(dY);
        displayResults(r,dY);
        
            
    }
    public static double validateInput(double a)
    {
        while (a<=0) 
        {
            System.out.println("Invalid input, re-enter value");
            a=in.nextInt();
        }
        return a;
    }
    
    public static double resultantX(double f1,double d1,double f2,double d2)
    {
        return (f1*Math.cos(d1))+(f2*Math.cos(d2));
    }
    
    public static double resultantY(double f1,double d1,double f2,double d2)
    {
        return (f1*Math.sin(d1))+(f2*Math.sin(d2));
    }
    
    public static double resultant(double rX,double rY)
    {
        return Math.sqrt((rX*rX)+(rY*rY));
    }
    
    public static double direction(double rX,double rY)
    {
        return Math.atan(rY/rX);
    }
    
    public static void displayResults(double m, double d)
    {
        System.out.printf("The magnitude is %.2f%n",m);
        System.out.printf("The direction is %.2f%n",d);
    }
   
}
