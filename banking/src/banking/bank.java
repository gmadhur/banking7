
package banking;
import java.util.Scanner;

public class bank 
{
    double accno;
    double bal;
    
    
    void deposit(double damt)
    {
        bal+=damt;
    }
    
    void withdraw(double wamt)
    {
        if(bal>wamt)
        bal-=wamt; 
        else
            System.out.println("Insufficient balance");
    }
    
    void disp()
    {
        System.out.println("Bal = "+bal);
    }
    
    public static void main(String[] args) 
    {
        int i,c;
        c=0;
        Scanner inp = new Scanner(System.in);
       bank[] a = new bank[20];
       for(i=0;i<a.length;i++)
       {
           a[i]=new bank();
       }
       exit:
       
       while(true)
       {
           
       System.out.println("Enter 1.Create 2.Deposit 3.Withdraw 4.Transfer 5.Total amount 6.Richest person. 7.Exit ");
       System.out.println("Enter the choice ");
       int ch = inp.nextInt();
       
       switch(ch)
       {
           case 1:{ 
                    System.out.println("Enter the account number ");
                    int acc = inp.nextInt();
 
                    for(i=0;i<a.length;i++)
                    {
                        if(a[i].accno==acc)
                        {
                            System.out.println("Account exists");
                            break;
                        }
                    }
                       a[c].accno= acc;
                       System.out.println("Enter the initial amount ");
                       a[c].bal= inp.nextDouble();
                       c++;
                        
                            break;
                        
                   }
           
           case 2:{ 
                    System.out.println("Enter the account number ");
                    int acc = inp.nextInt();
                    System.out.println("Enter the deposit amount ");
                    double damt = inp.nextDouble();
                    
                    for(i=0;i<a.length;i++)
                    {
                        if(a[i].accno==acc)
                        {
                            a[i].deposit(damt);
                            a[i].disp();
                            break;
                        }
                    }
                        if(i==a.length)
                       System.out.println("Account doesnot exist!! ");
                        
                           break;
                        
                   }
           case 3: {    
                       System.out.println("Enter the account number ");
                    int acc = inp.nextInt();
                    System.out.println("Enter the withdrawal amount ");
                    double wamt = inp.nextDouble();
                    
                    for(i=0;i<a.length;i++)
                    {
                        if(a[i].accno==acc)
                        {
                            a[i].withdraw(wamt);
                            a[i].disp();
                            break;
                        }
                    }
                        if(i==a.length)
                       System.out.println("Account doesnot exist!! ");
                        
                           break;
                        
                   } 
            case 4: {
                    System.out.println("Enter the account number from which you want to transfer ");
                    int acc1 = inp.nextInt();
                    
                    System.out.println("Enter the account number to which you want to transfer ");
                    int acc2 = inp.nextInt();
                    
                    System.out.println("Enter the transfering amount ");
                    double tamt = inp.nextDouble();
                    
                    for(i=0;i<a.length;i++)
                    {
                        if(a[i].accno==acc1)
                        {
                            a[i].withdraw(tamt);
                            a[i].disp();
                            break;
                        }
                    }
                    
                    for(i=0;i<a.length;i++)
                    {
                        if(a[i].accno==acc2)
                        {
                            a[i].deposit(tamt);
                            a[i].disp();
                            break;
                        }
                    }
                        if(i==a.length)
                       System.out.println("Account doesnot exist!! ");
                        
                           break;
                        
                   
                    }
            case 5:{
                        double totamt=0;
                        for(i=0;i<a.length;i++)
                        {
                            totamt+=a[i].bal;
                        }
                        System.out.println("Total Amount in the bank = "+totamt);
                            
                        break;
                
                    }
            case 6:{
                        double largebal=0;
                        int j=0;
                        for(i=0;i<a.length;i++)
                        {
                            if(a[i].bal>largebal)
                            {
                                largebal=a[i].bal;
                                j=i;
                            }
                                
                        }
                System.out.println("Richest person in the bank is with account number "+a[j].accno);
                            break;
                
                    }
            
            case 7: break exit;
            
                  
       }
    }
    
}
}
