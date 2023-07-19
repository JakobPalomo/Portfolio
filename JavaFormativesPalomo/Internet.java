
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
public class Internet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hoursUsed;
        double price=0;
        double addit=0;
        char planType;
        
        System.out.println("What package type did you get?(ex. A/B/C)\nPackage Type:");
        planType=in.next().charAt(0);
        planType=Character.toUpperCase(planType);
        System.out.println("How many hours were consumed?(ex. 32): ");
        hoursUsed=in.nextDouble();
        

        switch(planType)
        {
            case 'A': 
                if (hoursUsed>30)
                {
                    addit=hoursUsed-30;
                }
                price=200+(addit*20); break;
            case 'B':
                if (hoursUsed>50)
                {
                    addit=hoursUsed-50;
                }
                price=495+(addit*10); break;
            case 'C':
                price=995; break;
                
            default:
                System.out.println("Invalid input");
                return;
        }
 
        System.out.printf("Your internet bill is %.2f%n",price);
    }
}

