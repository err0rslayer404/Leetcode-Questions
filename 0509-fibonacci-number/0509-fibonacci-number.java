class Solution {
    public int fib(int n) {
        int x = 0, y = 1;
        while (n-- > 0) {
            int z = x + y;
            x = y;
            y = z;
        }
        return x;
    }
}