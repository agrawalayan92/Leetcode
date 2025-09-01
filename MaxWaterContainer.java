public class MaxWaterContainer {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            if(height[left] < height[right]){
                int newArea = height[left]*(right - left);
                if(maxArea < newArea){
                    maxArea = newArea;
                }
                left = left + 1;
            }
            else{
                int newArea = height[right]*(right - left);
                if(maxArea < newArea){
                    maxArea = newArea;
                }
                right = right - 1;
            }
        }
        
        return maxArea;
    }
}
