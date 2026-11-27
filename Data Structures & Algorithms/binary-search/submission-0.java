class Solution {
    public int search(int[] nums, int target) {
        

        int L = 0;
        int R = nums.length -1;

        while (R>=L){

            int mid = (R+L) / 2;

            if (nums[mid] == target ) return mid;
            if (nums[mid] > target ) R = mid - 1;
            else L = mid + 1;
        }

        return -1;
    }
}
