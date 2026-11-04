class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] outPut = new int[nums.length];
        HashMap<Integer, Integer> repeatedWork = new HashMap<>();

        for (int i = 0; i<nums.length; i++){
            if (repeatedWork.containsKey(nums[i])){
                outPut[i] = repeatedWork.get(nums[i]);
                continue;
            }
            int keep = 1;
            for (int j = 0; j<nums.length; j++){
                if (i==j) continue;
                keep *= nums[j];
            }
            outPut[i] = keep;
            repeatedWork.put(nums[i], keep);
        }
        return outPut;
    }
}  
