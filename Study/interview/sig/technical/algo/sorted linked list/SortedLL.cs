// Sorted linked list with a sentinel node
// Skeleton code
using System;

class SortedLL
{
    // internal data structure and
    // constructor code to be added here
    
    // this is the crucial method
    public void insert(int x)
    {
        Node prev, curr, t;
               
        // write code to insert x into sorted list

        Node t = new Node();    // new node

        t.data = x;

        curr = head;
        prev = null;

        while(x > curr.data)
        {
            prev = curr;
            curr = curr.next;
        }

        t.next = curr;

        if(prev == null)
        {
            head = t;
        }
        else
        {
            prev.next = t;
        }
             
    }    

    public void display()
    {
        Node t = head;
        Console.Write("\nHead -> ");
        while( t != z) {
            Console.Write("{0} -> ", t.data);
            t = t.next;
        }
        Console.Write("Z\n");
    }
    
    public static void Main()
    {
        SortedLL list = new SortedLL();
        list.display();
        
        int i, x;
        Random r = new Random();
        
        for(i=0; i<10; ++i) {
            x = r.Next(20);
            list.insert(x);
            Console.Write("\nInserting {0}", x);
            list.display();            
        }
        Console.ReadKey();
    }
}