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
public class Hotel 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        char rt;
        int days,xtra;
        double bill=0,grosc=0,net;
        
        System.out.println("What type of room? G-garden view, P – pool view, L – lake view");
        rt=in.next().charAt(0);
        rt=Character.toLowerCase(rt);
        System.out.println("Number of days?");
        days=in.nextInt();
        System.out.println("How many extra bed?");
        xtra=in.nextInt();
        
        switch (rt)
        {
            case 'g':
                bill=(days*(xtra*500))+(days*2000); break;
            case 'p':
                bill=(days*(xtra*400))+(days*1800); break;
            case 'l':
                bill=(days*(xtra*700))+(days*1500); break;
            default:System.out.println("Invalid input");
            return;
        }
        
        if (days>5) 
        {
            grosc=bill*.92;
        }else
            grosc=bill;
        
        net=grosc*1.12;
        
        System.out.printf("Your gross cost is %.2f%n",grosc);
        System.out.printf("Your total cost is %.2f%n",net);
        
    }
}
