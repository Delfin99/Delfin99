using System;  
   public class Account  
    {  
        public int accno;   
        public String name;  
        public static int count=0;  ∂
        public Account(int accno, String name)  
        {  
            this.accno = accno;  
            this.name = name;  
            count++;  
        }  
          
        public void display()  
        {  
            Console.WriteLine(accno + " " + name);  
        }  
   }  
   class TestAccount{  
       public static void Main(string[] args)  
        {  
            Account a1 = new Account(101, "Sonoo");  
            Account a2 = new Account(102, "Mahesh");  
            Account a3 = new Account(103, "Ajeet");  
            a1.display();  
            a2.display();  
            a3.display();  
            Console.WriteLine("Total Objects are: "+Account.count);  
        }  
    }  