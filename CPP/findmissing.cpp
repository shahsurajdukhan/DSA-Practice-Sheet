// Given an array containing n distinct numbers taken from the range 0 to n, find the one number that is missing.


#include <iostream>
#include <vector>
using namespace std;

int missingNumber(vector<int> & nums) {
    int n = nums.size();

    // expected sum of numbers
    int expectedSum = n * (n + 1) / 2;

    // calculate actual sum of elements
    int actualSum = 0;

    for (int i = 0; i <nums.size(); i++) {
        actualSum += nums[i];
    }

    // Difference is the missing number
    return expectedSum - actualSum;
}

int main () {
    vector <int> nums = {3,0,1};

    cout << "Missing Number: "<< missingNumber(nums) << endl;

    return 0;
}