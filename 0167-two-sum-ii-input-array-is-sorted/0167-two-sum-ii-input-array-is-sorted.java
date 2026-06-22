class Solution {
    public int[] twoSum(int[] numbers, int target) {

       int left = 0;
        int right = numbers.length -1;

        while(right > left){
         int sum = numbers[right] +numbers[left];
            if (sum == target ){
                int var1 = left +1;
                int var2 = right +1;
                return new int[]{var1 , var2};
            }
            else if (sum > target){
                right--;
            }
            else{
                left++;
            }
    
        }
  return new int[]{-1,-1}; 
    } 
    
}