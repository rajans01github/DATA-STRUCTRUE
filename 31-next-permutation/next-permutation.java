// Next Permutation - LeetCode 31
// Time: O(n), Space: O(1)
public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        
        int n = nums.length;
        int i = n-2;

        while( i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        if(i >= 0){
            int j = n - 1;
            while( j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums , i , j);
        }
       reverse(nums, i+1, n-1);
    }
    private void swap(int[] arr , int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
    private void reverse(int[] arr, int l , int r ){
        while( l < r){
            swap(arr, l++, r--);
        }
    }
       
}
