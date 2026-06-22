class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;

       while(left < right) 
       {
       int width = right - left;
       int heightt = Math.min(height[left], height[right]);
       int Area = width * heightt;

       maxArea = Math.max(maxArea, Area);
       
       if(height[left]< height[right]){
       left++;}
       else{
        right--;}
       }

        return maxArea;
        
    }
}