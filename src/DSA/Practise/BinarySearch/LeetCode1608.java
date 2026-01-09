package DSA.Practise.BinarySearch;

import java.util.Arrays;

public class LeetCode1608 {
    /**
     special-array-with-x-elements-greater-than-or-equal-x
     You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
     Notice that x does not have to be an element in nums.
     Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.
     */
    static int checkSpecial(int x, int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i >= x) count++;
        }
        return count;

    }

    public static int specialArray(int[] nums) {
        int high = nums.length, low = 0, mid = 0;
        while (low <= high) {
            mid = (high + low) / 2;
            int countX = checkSpecial(mid, nums);
            System.out.println(mid + " : count ->" + countX);
            if (countX > mid) {
                low = mid + 1;
            } else if (countX < mid) {
                high = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }

    static void main() {
        int[] nums = {0, 4, 3, 0, 4};
        int ans = specialArray(nums);
        System.out.println("TestCase :: \nnums : " + Arrays.toString(nums) + "\nAns : " + ans);
    }
}
