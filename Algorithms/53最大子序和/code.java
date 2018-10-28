class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int max_tmp=0;
        for(int i=0;i<nums.length;i++){
            max_tmp = (max_tmp+nums[i])>nums[i]?(max_tmp+nums[i]):nums[i];
            max = max>max_tmp?max:max_tmp;
        }
        return max;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int tmp = 0;
        int max = Integer.MIN_VALUE;
        int m;          //起始位置
        int n;          //终止位置
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=tmp+nums[i]){
                m = i;
                tmp = nums[i];
            }else{
                tmp = tmp + nums[i];
            }
            if(tmp > max){
                max = tmp;
                n = i;
            }
        }
        return max;
    }
}