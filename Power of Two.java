class Solution {
    public boolean isPowerOfTwo(int n) {
        // only 1 bit is 1
        int sum = 0;
        while(n > 0){
            sum += n & 1;
            n >>= 1;
        }
        return (sum == 1) ? true : false;
    }
}

// also bit count
class Solution {
    public boolean isPowerOfTwo(int n) {
        // only 1 bit is 1
        return n > 0 && Integer.bitCount(n) == 1;
    }
}

// n & n-1 trick
class Solution {
    public boolean isPowerOfTwo(int n) {
        // only 1 bit is 1
        // n & n-1 is 0
        return n > 0 && (n & (n-1)) == 0;
    }
}