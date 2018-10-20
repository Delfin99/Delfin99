// Sorted linked list with a sentinel node
// Skeleton code


class SortedLL
{
    // internal data structure and
    // constructor code to be added here

    class Node
    {
        int data;
        Node next;
    }

    private Node head;
    private Node z;

    public SortedLL()
    {
        // head = null;
        z = new Node();
        z.next = z;
        head = z;
    }
    
    // this is the crucial method
    public void insert(int x)
    {
        Node prev, curr, t;
               
        // write code to insert x into sorted list

        // initialize the data field of new node (t) 
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
    
    public void remove(int x) {
        
    }

    public void display()
    {
        Node t = head;
        System.out.print("\nHead -> ");
        while( t != z) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("Z\n");
    }
    
    public static void main(String args[])   
    {
        SortedLL list = new SortedLL();
        list.display();
        
        int i, x;
        Random r = new Random();
        
        for(int i = 1; i <= 10; ++i)  {
           x =  (Math.random()*100.0);
           r = (int) x; 
           System.out.println("Inserting " + r);
           list.insert(r);
           list.display();            
        }
        
    }
}