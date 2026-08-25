#include <iostream>
#include <vector>
using namespace std;

int findLargest(vector<int> & arr) {
    int largest = arr[0];

    for (int x : arr) {
        if (x > largest)
        largest = x;
    }

    return largest;
}
int main () {
    vector <int> arr = {10,25,7,99,32};

    cout << findLargest(arr);

    return 0;

}