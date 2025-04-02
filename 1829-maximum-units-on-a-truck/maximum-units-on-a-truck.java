class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes , (a , b) -> b[1] - a[1]);

        int max_items = 0;
        for(int i = 0 ; i < boxTypes.length ; i++){
            if(truckSize >= boxTypes[i][0]){
                max_items = max_items + (boxTypes[i][0] * boxTypes[i][1]);
                truckSize = truckSize - boxTypes[i][0];
            }
            else{
                max_items = max_items + (truckSize * boxTypes[i][1]);
                return max_items;
            }
        }

        return max_items;
        


    }
}