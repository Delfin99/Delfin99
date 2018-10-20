
#include <stdlib.h>
#include <iostream.h>
using namespace std;

class SortedLL {
  private:
    struct Node {
        int data;
        Node * next;
    };

    Node * head, *z;

  public:
    // the next 2 methods are defined inline, like in Java
    SortedLL() {
        z = new Node;
        z->next = z;
        head = z;
    }

    void display(){
        Node *t;

        cout << "\nList is \n";
        for(t=head; t != t->next; t = t->next)
            cout << t->data << "  ";
        cout << endl;
    }

    void insert(int x);
};


void SortedLL :: insert(int x) {
    Node *p, *c, * t;
    t = new Node;
    t->data = x;
    z->data = INT_MAX;
    cout << "\nINT_MAX = " << INT_MAX << endl;

    if (head == z || x <= head->data) {  // empty list {
        t->next = head;
        head = t;
    }
    else { // not empty list && insert after first node
        c = head;
        while( x > c->data ) {
            p = c; c = c->next;
        }
        p->next = t;
        t->next = c;
    }

}

void main() {
    SortedLL sl;

    sl.insert(11); sl.insert(22); sl.insert( 7);
    sl.insert(9); sl.insert(50);

    sl.display();

}