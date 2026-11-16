class Solution {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int idx = 0;
        int maxArea = 0;
        int prevHeight = height[0];

        // calculate the area
        while(idx < right) {

            // calculate the current Height
            int CurrHeight = Math.min(prevHeight, height[right]);


            // calculate te area
            int area = CurrHeight * (right-idx);

            if(prevHeight < height[right]) {
                idx++;
                prevHeight = height[idx];
            } else {
                right--;
            }

            maxArea = Math.max(maxArea, area);

        }

        return maxArea;
    }
}