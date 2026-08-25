#include <iostream>
#include <vector>
using namespace std;

void moveZeros(vector <int> & arr) {
    int flag = 0;

    for (int Eye = 0; Eye < arr.size(); Eye ++) {
        if (arr[Eye] != 0) {
            swap(arr[Eye], arr[flag]);
            flag = flag + 1;
           
        } 
    }
        
}

int main () {
    vector <int> arr = {0,5,3,0,4,0};

    moveZeros(arr);
    for (int value : arr) {
        cout << value << ' ';
    }

    return 0;
}



