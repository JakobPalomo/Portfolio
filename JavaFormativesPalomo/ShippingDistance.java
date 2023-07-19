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
public class ShippingDistance {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double W,Ch=0,Tc;
        int Dt,D;
        String Type;
        
        System.out.println("Weight of package?");
        W=in.nextDouble();
        System.out.println("Type of package?");
        Type=in.next();
        System.out.println("Distance to be shipped?");
        D=in.nextInt();
        Type=Type.toUpperCase();
        
        Dt=D/500;        
        if(D%500>0)
            Dt=Dt+1;
        if (Type.equals("A"))
        {
            if (W<=5)
                Ch=W*10.50*Dt;
            if (W>5&&W<=10)
                Ch=W*15.75*Dt;
            if (W>10&&W<=20)
                Ch=W*20.65*Dt;
        }
        if (Type.equals("B"))
        {
            if (W<=5)
                Ch=W*11.75*Dt;
            if (W>5&&W<=10)
                Ch=W*18.50*Dt;
            if (W>10&&W<=20)
                Ch=W*23.65*Dt;
        }
        Tc=Ch+(Ch*.10);
        System.out.printf("The charge is %.2f", Ch);
        System.out.printf(" The Total charge is %.2f%n", Tc);
        
    }
}
