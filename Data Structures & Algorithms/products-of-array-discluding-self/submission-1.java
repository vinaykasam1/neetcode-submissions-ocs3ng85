class Solution {
   public int[] productExceptSelf(int[] nums) {
        
        int[] res = new int[nums.length];

        for(int i = 0 ; i< nums.length; i++){
            int prefix = 1;
            int suffix = 1;

            for(int j = i; j>0; j--){
             prefix *= nums[j-1];
            }

            for(int k = i; k<nums.length -1 ; k++){
              suffix *= nums[k+1];
            }

            res[i] =  prefix * suffix;
        }
             return res;
    }
}  
