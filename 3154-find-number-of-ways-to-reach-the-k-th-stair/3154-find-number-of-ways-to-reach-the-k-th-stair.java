
import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<String, Integer> dp = new HashMap<>();

    public int waysToReachStair(int k) {
        return solve(1, 0, false, k);
    }

    int solve(int pos, int jump, boolean back, int k) {

        // We cannot reach k if position is too far ahead
        if (pos > k + 1) {
            return 0;
        }

        String key = pos + "," + jump + "," + back;

        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        int ways = 0;

        // If we are currently at target stair
        if (pos == k) {
            ways++;
        }

        // Forward jump: 2^jump
        ways += solve(pos + (1 << jump), jump + 1, false, k);

        // Backward jump: only if previous move wasn't backward
        if (!back && pos > 0) {
            ways += solve(pos - 1, jump, true, k);
        }

        dp.put(key, ways);

        return ways;
    }
}
