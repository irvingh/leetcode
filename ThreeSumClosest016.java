import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumClosest016 {
    public int threeSumClosest(int[] nums, int target) {
        int minTarget = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        if (nums==null || nums.length==0)
            return 0;
        if (nums.length<3) {
            for (int i = 0; i < nums.length; i++)
                res += nums[i];
            return res;
        }
        for (int i=0; i<nums.length-2; i++) {
            if (i==0 || nums[i]>nums[i-1]) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j<k) {
//                    System.out.println("i="+i+",j="+j+",k="+k+" "+nums[i]+" "+nums[j]+" "+nums[k]);
                    if (Math.abs(nums[i]+nums[j]+nums[k]-target) < minTarget) {
                        res = nums[i]+nums[j]+nums[k];
                        minTarget = Math.abs(res - target);
                        j++; k--;
                        while (j<k && nums[j-1]==nums[j]) j++;
                        while (j<k && nums[k+1]==nums[k]) k--;
                    } else if (nums[i]+nums[j]+nums[k]<0)
                        j++;
                    else
                        k--;
                }
            }
        }
        return res;
    }
}

