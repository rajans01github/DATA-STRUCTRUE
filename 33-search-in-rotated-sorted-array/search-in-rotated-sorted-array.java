class Solution {
    public int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (arr[mid] == target) return mid;


            if (arr[start] <= arr[mid]) { 
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1; 
                } else {
                    start = mid + 1;
                }
            } else { 
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1; 
                } else {
                    end = mid - 1; 
                }
            }
        }
        return -1; // Target not found
    }
}
