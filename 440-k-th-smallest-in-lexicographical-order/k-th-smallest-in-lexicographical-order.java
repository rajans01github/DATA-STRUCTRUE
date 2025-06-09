class Solution {
    public int findKthNumber(int n, int k) {
        long curr = 1;
        k = k - 1;  // we count 1 as already visited

        while (k > 0) {
            long count = getCount(curr, n);
            if (count <= k) {
                // skip to next sibling prefix
                curr++;
                k -= count;
            } else {
                // go to next level (deeper child)
                curr *= 10;
                k -= 1;  // we count curr itself
            }
        }

        return (int) curr;
    }

    private long getCount(long prefix, long n) {
        long count = 0;
        long current = prefix;
        long next = prefix + 1;

        while (current <= n) {
            count += Math.min(n + 1, next) - current;
            current *= 10;
            next *= 10;
        }

        return count;
    }
}
