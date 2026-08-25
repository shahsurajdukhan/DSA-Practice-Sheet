#include <iostream>
#include <vector>
#include <climits>
using namespace std;

int SecondLargest(vector<int>& arr) {
    int largest = INT_MIN;
    int second = INT_MIN;
    
    for (int x : arr) {
        if (x > largest) {
            second = largest;
            largest = x;
        }
        else if (x > second && x != largest) {
                second = x;
        }
    }

return second;
}

int main () {
    vector <int> arr = {10,5,20,8,15};

    cout << SecondLargest(arr);

    return 0;
}