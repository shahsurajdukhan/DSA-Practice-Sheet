#include <iostream>
#include <vector>
using namespace std;

int missingNumber(vector<int> & arr) {
    int n = arr.size();

    int result = n;

    for (int i=0; i< n; i++) {
        result = result ^ i;
        result = result ^ arr[i];
    }

    return result;
}

int main() {
    vector<int> arr = {5,4,2,3,1};

    int answer = missingNumber(arr);

    cout << "Missing Number: "<< answer << endl;

    return 0;
}