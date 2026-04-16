class Solution {
    public boolean isPalindrome(String s) {

       int left = 0;
       int right = s.length() - 1;

       while (left < right){
        int leftchar = s.charAt(left);
        int rightchar = s.charAt(right);

        if(!Character.isLetterOrDigit(leftchar)){
            left++;
            continue;
        }

        if(!Character.isLetterOrDigit(rightchar)){
            right--;
            continue;
        }

        if(Character.toLowerCase(leftchar) != Character.toLowerCase(rightchar) ){
            return false;
        }
         left++;
         right--;

       }
       return true;
    }
}
