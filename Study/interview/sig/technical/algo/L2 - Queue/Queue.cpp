// Queue.cpp

// Partial linked list implementation of a Queue

// Static allocation of Queue objects in main()

#include <iostream.h>


class Queue {
private:

    // put in linked list data structure here

public:
    Queue() {
        z = new Node; z->next = z;
        head = z;  tail = NULL;
    }

    void display();
    void enQueue(int x);
    int deQueue();
    bool isEmpty();
};



void Queue::display() {
    cout << "\nThe queue values are:\n";

    Node * temp = head;
    while( temp != temp->next) {
        cout << temp->data << "  ";
        temp = temp->next;
    }
    cout << "\n\n";
}






void Queue::enQueue( int x) {
    Node * temp;

    temp = new Node;
    temp->data = x;
    temp->next = z;


    if(tail == NULL)  // case of empty list
        // fill in yourself
    else              // case of list not empty
        // fill in yourself

    // fill in yourself   // new node is now at the tail
}


// assume the queue is non-empty when this method is called
// In general, an exception should be thrown if this is not so.
int Queue::deQueue() {
    Node * temp = head;

    if (head == tail)     // 1 node in queue
        // fill in yourself     // updated list will be empty

    int x = head->data;    // Store data value of 1st node.
    // fill in yourself    // Break link to 1st node, head
                          // then points to second node
    // fill in yourself          // return the node's memory to heap
    return x;             // return value removed from queue
}


bool Queue::isEmpty() {
        return head == head->next;
}


// try out the ADT Queue using static allocation
void main() {

   Queue q;

   cout << "Inserting ints from 9 to 1 into queue gives:\n";
   for (int i = 9; i > 0; --i) {
      q.enQueue( i);
   }

   q.display();

   if( ! q.isEmpty())
        cout << "Deleting value from queue " << q.deQueue() << "\n";

   cout << "Adding value to queue " << 27 << "\n";
   q.enQueue(27);
   q.display();

}

