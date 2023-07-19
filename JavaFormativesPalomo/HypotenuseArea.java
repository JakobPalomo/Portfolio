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
public class HypotenuseArea {
    
        static Scanner in=new Scanner(System.in);
    public static void main(String[] args) 
    {
        double a,b,hyp,ar;
        System.out.println("Side A?");
        a=in.nextDouble();
        a=validateInput(a);
        System.out.println("Side B?");
        b=in.nextDouble();
        b=validateInput(b);
        hyp=hypotenuse(a,b);
        ar=area(a,b,hyp);
        display(hyp,ar); 
    }
    
    public static double hypotenuse(double a, double b)
    {
        return Math.sqrt((a*a)+(b*b));   
    }
    
    public static double area(double a, double b,double h)
    {
        return (a*b)/2;
    }
    
    public static void display(double hyp,double ar)
    {
        System.out.printf("The hypotenuse is %.2f%n",hyp);
        System.out.printf("The area is %.2f%n",ar);
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
    }

