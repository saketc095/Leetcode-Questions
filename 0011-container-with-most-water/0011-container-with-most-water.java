class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxAmount = 0;

        while(left < right){
            int minHeight = Math.min(height[left], height[right]);
            int distance = right - left;
            maxAmount = Math.max(maxAmount, minHeight * distance);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxAmount;
    }
}