/*

 */
import java.util.*;
public class ABCMeal 
{
    public static void main(String[] args) 
    {
       Scanner in = new  Scanner(System.in);
        char sc,mc;
        double bill=0;
        int orders;
        
        System.out.println("What is the meal type?(a/b/c)");
        mc=in.next().charAt(0);
        mc=Character.toUpperCase(mc);
        System.out.println("What is the size of the meal?(s/u)");
        sc=in.next().charAt(0);
        sc=Character.toUpperCase(sc);
        System.out.println("How many orders?");
        orders=in.nextInt();
        
        
        if (mc!='A'&&mc!='B'&&mc!='C')
        {
            System.out.println("Invalid meal type");
            return;
        }
        if (sc!='R'&&sc!='U')
        {
            System.out.println("Invalid size code");
            return;
        }

        
        switch (mc)
        {
            case 'A':
                switch(sc)
                {
                    case 'R':bill=orders*78.75; break;
                    case 'U':bill=orders*102.5; break;
                } break;
            case 'B':
                switch(sc)
                {
                    case 'R':bill=orders*68.75; break;
                    case 'U':bill=orders*85.70; break;
                } break;
            case 'C':
                switch(sc)
                {
                    case 'R':bill=orders*70.25; break;
                    case 'U':bill=orders*95.60; break;
                } break;
        }    
        
        if (orders>5)
            bill=0.88*bill;
        
        bill=1.1*bill;
        
        System.out.printf("Your total bill is : %.2f%n",bill);
    }
}
