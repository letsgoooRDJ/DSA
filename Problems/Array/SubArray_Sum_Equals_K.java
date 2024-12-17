/*
560. Subarray Sum Equals K
Solved
Medium
Topics
Companies
Hint
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2

  */

// code solution
class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=nums.length;
       int prefixSum=0;
       int count=0;
       map.put(0,1);

       for(int i=0;i<n;i++){
        
        prefixSum += nums[i];
        int r = prefixSum - k;
        count += map.getOrDefault(r,0);
        map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);

       }

       return count;
    }
}
