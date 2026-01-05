class Solution {

    // helper function: normal palindrome check
    public boolean Palin(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                // ek delete allowed
                return Palin(s, left + 1, right) ||
                       Palin(s, left, right - 1);
            }
        }
        return true;
    }
}
