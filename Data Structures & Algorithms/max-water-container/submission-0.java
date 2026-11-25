class Solution {
    public int maxArea(int[] heights) {
        

        int result = 0;
        int left = 0;
        int right = heights.length -1;

        while (right>=left){
            int width = right-left;
            int height = Math.min(heights[right], heights[left]);
            int area = width * height;
            if (area > result) result = area;
            if (heights[left] > heights[right]) right--;
            else left++;
        }

        return result;
        
    }
}
