// cirQueue.cpp
// Partial circular buffer implementation of a Queue

#include <stdio.h>
#include <iostream.h>

#define _qmax 100

class Queue {

  private:
    int *q, back, front;
    int qmax, size;

  public:
    Queue();
    void enQueue(int x);
    int deQueue();
    bool isEmpty();
    void display();
};



Queue::Queue() {
    qmax = _qmax;
    size = front = back = 0;
    q = new int[qmax];
}


void Queue::enQueue( int x)
{
    if( qmax == size) return;

 // COMPLETE THIS METHOD
}




int Queue::deQueue()
{
    if(size == 0) return -9999; //should not happen

    // COMPLETE THIS METHOD
}



bool Queue::isEmpty() {

    // COMPLETE THIS METHOD
}



void Queue::display()
{
    int i, n;
    printf("\n\nQueue is: ");
    for(i=front, n=1; n<=size; ++n) {
        printf(" %d", q[i]);
        i = (i + 1) % qmax;
    }
    printf("\n\n");
}


// try out the Circular Buffer Queue using static allocation
void main()
{

    Queue q(5);

    int i;
    for(i=1; i<=5; ++i)
        q.enQueue(i);

    q.display();

    q.deQueue();
    q.deQueue();
    q.enQueue(11);

    q.display();
}

