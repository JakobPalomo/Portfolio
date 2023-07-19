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
public class CallPrice {
     public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double LC,GC;
        double NC=0;
        String Timee;
        
        System.out.println("Lenth of call?");
        LC=in.nextDouble();
        System.out.println("Time of call (A-day B-night)?");
        Timee=in.next();
        Timee=Timee.toUpperCase();
        
        GC=LC*4;
        if (Timee.equals("A"))
            NC=GC;
        if (Timee.equals("B"))
            NC=GC-(GC*.5);
        if (LC>60)
            NC=NC-(NC*.15);
        NC=NC+(NC*.12);
        
        System.out.println("Gross cost "+GC+" Net Cost "+NC);
      
    }
}
