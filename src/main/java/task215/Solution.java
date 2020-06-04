package task215;

import java.util.ArrayList;
import java.util.List;

//Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 0};
        System.out.println(findKthLargest(nums, 2));

    }

    public static int findKthLargest(int[] nums, int k) {
        List left = new ArrayList();
        List right = new ArrayList();
        int j = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (i != j) {
                if (nums[i] >= nums[j]) left.add(nums[i]);
                else right.add(nums[i]);
            }
        }
        if (left.size() + 1 == k) return nums[j];
        else if (left.size() + 1 > k) {
            int[] array = listToArray(left);
            return findKthLargest(array, k);
        } else {
            int[] array = listToArray(right);
            return left.size() == 0 ? findKthLargest(array, k-1) : findKthLargest(array, k - (left.size() + 1));
        }
    }

    protected static int[] listToArray(List list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = (int) list.get(i);
        }
        return array;
    }
}
