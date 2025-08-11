class Solution {
    public int maxProduct(int[] nums) {
        int Maxpro = nums[0];
        int Maxcur = nums[0];
        int Mincur = nums[0];

        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] < 0){
                int temp = Maxcur;
                Maxcur = Mincur;
                Mincur = temp;
            }

            Maxcur = Math.max(nums[i],Maxcur * nums[i]);
            Mincur = Math.min(nums[i], Mincur * nums[i]);

            Maxpro = Math.max(Maxpro, Maxcur);
        }
        return Maxpro;
    }
}