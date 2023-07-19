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
public class AbiggerB {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) 
    {
        char cont;
        while (true)
        {
            input();
            System.out.println("Do you want to continue y/n");
            cont=in.next().charAt(0);
            cont=Character.toLowerCase(cont);
            if(cont=='n')
                break;
            
        }
    }
    
    public static void input()
    {
        double a,b;
        System.out.println("A value?");
        a=in.nextDouble();
        System.out.println("B value?");
        b=in.nextDouble();
        while (a>b) 
        {
            System.out.println("a should be bigger than b");
            a=in.nextInt();
            b=in.nextInt();
        }
        System.out.println("X\tY");
        compute(a, b);
    }
    
    public static void compute(double a,double b)
    {
        double y;
        for (double i = a; i < b; i+=.2) 
        {
           y=(3*Math.pow(i, 5))-(2*Math.pow(i, 3))+i;
           display(y,i);
        }
    }
    
    public static void display(double y,double x)
    {
        System.out.printf("%.2f\t",x);
        System.out.printf("%.2f%n",y);
    }
}
