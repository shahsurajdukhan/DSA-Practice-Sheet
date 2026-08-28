#include <iostream>
#include <vector>
#include <climits>
using namespace std;

int maxSubarraySum(vector<int> & arr) {

    int currentSum = 0;
    int maximumSum = INT_MIN;

    for (int i =0; i < arr.size(); i++) {

        currentSum = currentSum + arr[i];

        if(currentSum > maximumSum) {
            maximumSum = currentSum;
        }

        if (currentSum < 0) {
            currentSum = 0;
        }
    }

    return maximumSum;
}

int main() {
    vector<int> arr = {-2,1,-3,4,-1,2,1,-5,4};

    int answer = maxSubarraySum(arr);

    cout << "Maximum subarray sum: " << answer << endl;

    return 0;
}