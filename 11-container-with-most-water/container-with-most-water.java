class Solution {
    public int maxArea(int[] h) {
        int left = 0;
        int right = h.length - 1;

        int MaxA = 0;

        while(left < right){
            int Area = Math.min(h[left], h[right]) * (right - left);

             MaxA = Math.max(MaxA, Area);

            if(h[left] < h[right]){
                left++;
            }else{
                right--;
            }


        }
        return MaxA;
    }
}