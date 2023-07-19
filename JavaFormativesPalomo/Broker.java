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
public class Broker 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        double salePrice,netCom=0,gross=0;
        char propCode,broker;
        
        System.out.println("What is your sale price?");
        salePrice=in.nextDouble();
        System.out.println("Commission type? r/c/g");
        propCode=in.next().charAt(0);
        propCode=Character.toUpperCase(propCode);
        System.out.println("Broker type? i/a");
        broker=in.next().charAt(0); 
        broker=Character.toUpperCase(broker);
        
        if (propCode!='R'||propCode!='C'||propCode!='G')
        {
        }else System.out.println("Invalid code");
        if (salePrice>0)
        {    
        }else System.out.println("Invalid price");
        
        switch (propCode)
        {
            case 'R':
                gross=salePrice*.06; break;
            case 'C':
                gross=salePrice*.045; break;
            case 'G':
                gross=salePrice*.04; break;
        }
        switch (broker)
        {
            case 'I':
                netCom=gross*0.8; break;
            case 'A':
                netCom=gross*0.75; break;
        }
        
        System.out.printf("Your gross commission is %.2f%n",gross);
        System.out.printf("Your net commission is %.2f%n",netCom);
        
    }
}
