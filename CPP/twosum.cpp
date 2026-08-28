// given an array and a target value , find two elements whose sum equals the target.

#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

vector<int> twoSum(vector<int>& arr, int target) {

    unordered_map<int, int> mp;

    for (int i =0; i < arr.size(); i++) {

        int required = target - arr[i];

        if (mp.find(required) != mp.end()) {
            return {mp[required], i};
        }

        mp[arr[i]] = i;
    }

    return {};
}

int main() {
    vector <int> arr = {2,15,11,7};
    int target = 9;

    vector <int> answer = twoSum(arr,target);

    if (!answer.empty()) {
        cout << "Indices: " << answer[0] << " " << answer[1] << endl;
        cout << "Elements: "
             << arr[answer[0]] << " + "
             << arr[answer[1]] << " = "
             << target << endl;
    }
    else {
        cout << "No Pair Found" <<endl;
    }

    return 0;
}