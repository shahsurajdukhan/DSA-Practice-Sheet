#include <iostream>
using namespace std;

class Stack {
    private:
        int arr[100];
        int top;

    public:
        //Constructor
        Stack() {
            top = -1;
        }

        // Push Element
        void push(int value) {
            if (top == 99) {
                cout << "Stack Overflow" << endl;
                return;
            }

            arr[++top] = value;
        }

        // Remove top element
        void pop() {
            if (top == -1) {
                cout << "Stack Underflow" << endl;
                return;
            }

            top--;
        }

        // Return top element
        int peek() {
            if (top == -1) {
                cout << "Stack is empty" << endl;
                return -1;
            }

            return arr[top];
        }

        // check if stack is empty
        bool isEmpty() {
            return top == -1;
        }

};

int main() {
    Stack s;

    s.push(10);
    s.push(20);
    s.push(30);

    cout << "Top element: "<< s.peek() << endl;

    s.pop();

    cout << "Top element after pop: " << s.peek() << endl;

    return 0;
}