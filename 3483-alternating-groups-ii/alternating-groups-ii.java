class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        
        int n = colors.length;
        int low = 0, high = 1;
        int count = 0;

        while(low < n && high < (n+k-1)){

            if(colors[high%n] == colors[(high-1)%n]){
                low = high;
            }
            if((high-low+1) == k){
                count++;
                low++;
            }
            high++;
        }

        return count;

    }
}