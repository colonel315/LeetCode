package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 1/2/2017.
 */
public class TwoSum {
    public static void main(String args[]) {
        TwoSum twoSum = new TwoSum();

        int[] nums = new int[5];

        for(int i = 0; i < 5; i++) {
            nums[i] = i+1;
        }

        System.out.print(Arrays.toString(twoSum.twoSum(nums, 3)));
    }
    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] solution = new int[2];

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(map.get(target-nums[i]))) {
                solution[0] = map.get(target - nums[i]);
                solution[1] = i + 1;
                return solution;
            }

            map.put(nums[i], i + 1);
        }

        return solution;
    }
}
