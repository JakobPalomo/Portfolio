
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
public class Overload 
{
    
    static Scanner in=new Scanner (System.in);
    public static void main(String[] args) 
    {
        System.out.println("This program is a calculator for finding arithmetic series,");
        System.out.println("geometric series, harmonic mean,");
        System.out.println("geometric mean, and largest prime number.\n");
        choices();
        System.out.println("\nThank you for using this calculator\n");
    }
    
    public static void choices()
    {
        char choice='K';
        while(choice!='Q')
        {
        System.out.println("Select your method:");
        System.out.println("A-Arithmetic series");
        System.out.println("B-Geometric series");
        System.out.println("C-Harmonic mean");
        System.out.println("D-Geometric mean");
        System.out.println("E-Largest prime number");
        System.out.println("F-Polynomial of Degree");
        System.out.println("Q-Quit program");
        
        System.out.print("\nWhat is your choice?:");
        choice=in.next().charAt(0);
        choice=Character.toUpperCase(choice);
        choice=validate(choice);
        lists(choice);
        }
        
    }
    
    public static char validate(char choice)
    {
        while (choice!='A'&&choice!='B'&&choice!='C'&&choice!='D'&&choice!='E'&&choice!='F'&&choice!='Q')
        {
            System.out.println("Invalid operation type, reinput");
            choice=in.next().charAt(0);
            choice=Character.toUpperCase(choice);
        }
        return choice;
    }
    public static char decimal()
    {
        char ans;
        System.out.println("Will you input decimals?y/n");
        ans=in.next().charAt(0);
        ans=Character.toUpperCase(ans);
        return ans;
    }

    public static void lists(char choice)
    {
        char ans;
        switch (choice)
        {
            case 'A': 
                ans=decimal();
                double a,d,n;
                int A,D,N;
                
                if (ans=='Y')
                {
                    System.out.println("What is your a,d,n(n greater than 0)");
                    a=in.nextDouble();
                    d=in.nextDouble();
                    n=in.nextDouble();
                    arithmetic(a,d,n);
                }
                else
                {
                    System.out.println("What is your a,d,n(n greater than 0)");
                    A=in.nextInt();
                    D=in.nextInt();
                    N=in.nextInt();
                    arithmetic(A,D,N);
                }
                break;
            case 'B':
                ans=decimal();
                int r;
                double Ab,Db,Nb;
                
                if (ans=='Y')
                {
                    System.out.println("What is your a,d,n(n greater than 0)");
                    Ab=in.nextDouble();
                    Db=in.nextDouble();
                    Nb=in.nextDouble();
                    geoMetric(Ab,Db,Nb);     
                }
                else
                {
                    System.out.println("What is your a,r,n(n greater than 0)");
                    a=in.nextInt();
                    r=in.nextInt();
                    n=in.nextInt();
                    geoMetric(a,r,n);
                }
                break;
            case 'C':
                ans=decimal();
                double h;
                int H;
                
                if (ans=='Y')
                {
                    System.out.println("What are your inputs? End with 0");
                    h=in.nextDouble();
                    harmMean(h);
    
                }
                else
                {
                    System.out.println("What are your inputs? End with 0");
                    H=in.nextInt();
                    harmMean(H);
                }
                break;
            case 'D':
                ans=decimal();
                double g;
                int G;
                
                if (ans=='Y')
                {
                    System.out.println("What are your inputs, 0 ends it");
                    g=in.nextDouble();
                    geoMean(g);
    
                }
                else
                {
                    System.out.println("What are your inputs, 0 ends it");
                    G=in.nextInt();
                    geoMean(G);
                }
                break;
            case 'E':
                primeNum();
                break;
            case 'F':
                ans=decimal();
                double x;
                if (ans=='Y')
                {
                    System.out.println("What is the x?");
                    x=in.nextDouble();
                    System.out.println("What is the n?");
                    n=in.nextDouble();
                    taylorPoly(x,n);
                }
                else
                {
                    taylorPoly();
                }
                break;
      
        }
    }
    
    public static void arithmetic(double a, double d, double n)
    {
        double ans=0;
        
        while (n<0)
        {
            System.out.println("Invalid n input");
            n=in.nextInt();
        }
                
        for (int i=0; i < n; i++) 
        {
            ans=ans+(a+(i*d));
            System.out.println("term "+i+" is "+(a+(i*d)));
        }
                
            System.out.println("\nArethmetic series is "+ans+"\n");
    }
    public static void arithmetic(int a, int d, int n)
    {
        int ans=0;

        while (n<0)
        {
            System.out.println("Invalid n input");
            n=in.nextInt();
        }
                
        for (int i=0; i < n; i++) 
        {
            ans= (ans+(a+(i*d)));
            System.out.println("term "+i+" is "+(a+(i*d)));
        }
                
            System.out.println("\nArethmetic series is "+ans+"\n");
    }
    public static void geoMetric(int a, int r, int n)
    {
        int geosum=0;
        while (n<0)
        {
            System.out.println("Invalid n input");
            n=in.nextInt();
        }
               
        for (int i=0,ct=1; i < n; i++,ct++) 
        {
            geosum=geosum+ (int) (a*(Math.pow(r, i)));
            System.out.println("term "+ct+" is "+(int)(a*(Math.pow(r, i))));
        }
            System.out.println("\nGeometric series is "+geosum+"\n");
    }
    public static void geoMetric(double a, double r, double n)
    {
        double geosum=0;
        while (n<0)
        {
            System.out.println("Invalid n input");
            n=in.nextInt();
        }
               
        for (int i=0,ct=1; i < n; i++,ct++) 
        {
            geosum=geosum+ (int) (a*(Math.pow(r, i)));
            System.out.println("term "+ct+" is "+(a*(Math.pow(r, i))));
        }
            System.out.println("\nGeometric series is "+geosum+"\n");
    }
    public static void harmMean(double h)
    {
        double bsum=0,cctr=0,harmonic=0;
        while (h!=0)
                {
                    bsum+=1/h;
                    cctr++;
                    h=in.nextDouble();
                }
                
                harmonic=cctr/bsum;
                System.out.println("Harmonic mean is "+harmonic+"\n");
    }
    public static void harmMean(int h)       
    {
        double bsum=0,cctr=0,harmonic=0;
        while (h!=0)
                {
                    bsum+=1.0/h;
                    cctr++;
                    h=in.nextInt();
                }
                
                harmonic=cctr/bsum;
                System.out.println("Harmonic mean is "+harmonic+"\n");
    }       
    public static void geoMean(double g)
    {
        double gM=0,gctr=0,gpro=1;
        while(g!=0)
        {
            while (g<0)
            {
                System.out.println("Invalid input");
                g=in.nextDouble();
            }
            gctr++;
            gpro*=g;
            g=in.nextDouble();
            }
            gM=Math.pow(gpro, 1/gctr);

        System.out.println("The geometric mean is "+gM+"\n");
    }
    public static void geoMean(int G)
    {
        double gM=0,gctr=0,gpro=1;
        while(G!=0)
        {
            while (G<0)
            {
                System.out.println("Invalid input");
                G=in.nextInt();
            }
            gctr++;
            gpro*=G;
            G=in.nextInt();
            }
            gM=Math.pow(gpro, 1/gctr);

        System.out.println("The geometric mean is "+gM+"\n");
    }
    public static void primeNum()
    {
        int pnum,bnum=0;
                
            System.out.println("What are your inputs (0 ends it)");
            pnum=in.nextInt();
                
            while(pnum!=0)
            {
                while(pnum<0)
                {
                    System.out.print("Invalid input try another:");
                    pnum=in.nextInt();
                }

                int mult=0;

                for (int pr=1; pr <= pnum;pr++)
                {
                    if (pnum%pr==0) 
                    {
                        mult++;
                    }   
                    }
                if (mult<=2) 
                {
                    if (pnum>bnum) 
                    {
                        bnum=pnum;
                    }
                }
                pnum=in.nextInt();  
                }
            System.out.println("Biggest prime number is "+bnum+"\n");
    }
    public static void taylorPoly()
    {
        int x,n,N=1;
        double term,overall=1;
        System.out.println("What is the x?");
        x=in.nextInt();
        System.out.println("What is the n?");
        n=in.nextInt();
        
        
        for (int i = 1; i <= n; i++,N++) 
        {
            int sum=1;
            for (int ctr=1;ctr<=N;ctr++) 
            {            
            sum=sum*ctr;  
            }
            term=Math.pow(x, i)/sum;
            overall+=term;
            System.out.println("term "+i+" is "+term);
        }
        
        System.out.printf("The Taylor Polynomial of Degree is %.2f%n%n",overall);
        
    }
    public static void taylorPoly(double x,double n)
    {
        int N=1;
        double term,overall=1;

        for (int i = 1; i <= n; i++,N++) 
        {
            int sum=1;
            for (int ctr=1;ctr<=N;ctr++) 
            {            
            sum=sum*ctr;  
            }
            term=Math.pow(x, i)/sum;
            overall+=term;
            System.out.println("term "+i+" is "+term);
        }
        
        System.out.printf("The Taylor Polynomial of Degree is %.2f%n%n",overall);
    }
}
