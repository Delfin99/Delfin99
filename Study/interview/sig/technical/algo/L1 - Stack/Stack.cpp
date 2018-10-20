// Partial linked list implementation of a Stack

#include <iostream>
#include <stdlib>
using namespace std;

class Stack {
    public:
        void push(int x);
        // int pop(void);
        bool isEmpty();
        Stack() { top = NULL;}
        void display();
        
    private:        
        // define a data structure for linked list nodes.
        struct Node {
            int data;
            Node * next;
        } * top;
};
    
    
void Stack::push(int x) {
    Node * t = new Node;
    t->data = x;
    t->next = top;
    top = t;
}



bool Stack::isEmpty(){
    return top == NULL;
}

void Stack::display() {
    Node * t = top;
    cout << "\nStack contents are:  ";
    while (t != NULL) {
        cout << t->data << "   ";
        t = t->next;
    }
    cout << "\n";
}


void main(){
    Stack s;
    s.push(10); s.push(3); s.push(11); s.push(7);
    s.display();
   
}

    