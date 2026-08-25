// Question - Find whether a given element exists in an array

#include <iostream>
#include <vector>
using namespace std;


int linearsearch(vector<int> & arr, int target) {
    for (int i = 0; i < arr.size(); i++) {
        if (arr[i] == target)
        return i;
    }

    return -1;
}

int main () {
    vector <int> arr = {1,5,8,20};

    cout << linearsearch(arr, 20) << " ";

    return 0;
}