class Solution {
    public int singleNonDuplicate(int[] nums) {
    int n= nums.length;
    int res=0;
    for(int i=0;i<n;i++){
        res=res^nums[i];
    } 
    return res;
    }
}
//optimal:XOR approach will wipe of all twice repeated numbers and result only the element that appeared twice

/* brute force:
 if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
   */     