import java.util.*;
import java.util.stream.Collectors;

class Solution740 {

    public int deleteAndEarn(int[] nums) {
        int[] dp = new int[10001];
        for (int num : nums) {
            dp[num] += num;
        }
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[10000];
    }

//    public int deleteAndEarn(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + nums[i]);
//        }
//        List<Integer> list = new ArrayList<>();
//        for (int i : nums) {
//            list.add(i);
//        }
//        list = list.stream()
//                .sorted()
//                .distinct()
//                .collect(Collectors.toList());
//        int[] dp = new int[list.size() + 1];
//        dp[0] = 0;
//        dp[1] = map.get(list.get(0));
//        for (int i = 2; i < dp.length; i++) {
//            int t = map.get(list.get(i-1));
//            if (list.get(i-1) - list.get(i - 2) != 1) {
//                t += dp[i - 1];
//                dp[i] = t;
//            } else {
//                dp[i] = Math.max(t + dp[i - 2], dp[i - 1]);
//            }
//        }
//        return dp[list.size()];
//    }
}