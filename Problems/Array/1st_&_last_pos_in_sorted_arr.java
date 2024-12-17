/*

34. Find First and Last Position of Element in Sorted Array
Solved
Medium
Topics
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

*/

// code

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        arr[0]=binarySearch(nums,target,true);
        arr[1]=binarySearch(nums,target,false);
        return arr;
    }

    public int binarySearch(int[] nums,int target,boolean isLeft){
        int idx=-1;
        int left=0;
        int right=nums.length -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid]==target){
                idx=mid;
                if(isLeft){
                    right = mid -1;
                }else{
                    left = mid+1;
                }
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return idx;
    }
}
