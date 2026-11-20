class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] warmer = new int[temperatures.length];

        for (int i=0; i<temperatures.length; i++){
            int start = i+1;
            int jump = 1;
            boolean got = false;
            while(start<temperatures.length){
                if (temperatures[start] > temperatures[i]){
                    warmer[i]= jump;
                    got = true;
                    break;
                } 
                start++;
                jump++;
            }

            if (!got){
                warmer[i] = 0;
            }
        }
        return warmer;
    }
}
