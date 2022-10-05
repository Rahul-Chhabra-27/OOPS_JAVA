package rahul.DSA;

import java.util.*;

public class countSubarrays {
    // Count Subarrays which is divisible by k.....
   static long countSubarray(int nums[],int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        long ans = 0;
        int sum = 0;
        map.put(0,1);
        for(int i = 0;i<n;i++) {
            sum  = ((sum + nums[i])%k + k)%k;
            ans += map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[]  = new int[n];
        Arrays.fill(nums,0);
        for(int i = 0;i<n;i++) nums[i] = sc.nextInt();
        System.out.println(countSubarray(nums,k));
    }
}
