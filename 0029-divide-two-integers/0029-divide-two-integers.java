class Solution {

    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE &&
            divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to long to safely handle -2147483648
        long dividendLong = Math.abs((long) dividend);
        long divisorLong = Math.abs((long) divisor);

        long quotient = 0;

        while (dividendLong >= divisorLong) {

            long value = divisorLong;
            long multiple = 1;

            // Find the largest doubled divisor
            while (dividendLong >= (value << 1)) {
                value = value << 1;
                multiple = multiple << 1;
            }

            dividendLong -= value;
            quotient += multiple;
        }

        if (negative) {
            quotient = -quotient;
        }

        return (int) quotient;
    }
}