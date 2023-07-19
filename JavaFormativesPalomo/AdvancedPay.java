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
public class AdvancedPay 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        char et;
        double sales,adv,gc=0,nc=0;
        
        System.out.println("Your sales per month?");
        sales=in.nextDouble();
        System.out.println("Your advanced amount?");
        adv=in.nextDouble();
        System.out.println("What type of employee? R/C");
        et=in.next().charAt(0);
        et=Character.toLowerCase(et);

        if (adv>10000) {
            System.out.println("You went over the cash advanced limit");
            return;
        }
        
        switch (et)
        {
            case 'r':
                if (sales<=200000) 
                    gc=sales*.05;
                if (sales>200000&&sales<500000) 
                    gc=sales*.0625;
                if (sales>500000) 
                    gc=sales*.082; 
                 break;
            case 'c':
                if (sales<=200000) 
                    gc=sales*.045;
                if (sales>200000&&sales<500000) 
                    gc=sales*.0575;
                if (sales>500000) 
                    gc=sales*.075;
                break;
            default:System.out.println("Invalid input");
            return;
        }
        
        nc=(gc*.88)-adv;
        
        System.out.printf("Your gross commission is %.2f%n",gc);
        
        if (nc>0)
        System.out.printf("Your net commission is %.2f%n",nc);
        else{
            nc=nc*-1;
            System.out.printf("refund is %.2f%n",nc);
        }
    }
}
