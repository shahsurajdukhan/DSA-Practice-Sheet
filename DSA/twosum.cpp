// Two Sum
// You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

class Solution {
    public: 
    vector<int> twoSum(vector<int> & nums , int target) {
        unordered_map (int, int) mp;
        for (int i = 0; i< nums.size(); i++) {
            int complement = target - nums[i];

            if(mp.find(complement) != mp.end()) {
                return {mp[complement] , i};
            }
            mp[nums[i]] = i;
        }

        return {};
    }
};