
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> mapp =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=mapp.getOrDefault(nums[i],0);
            mapp.put(nums[i],value+1);
            if(value==1){
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}
/*Hash Map is used.It stotes element and its value(no.of times it is repeating)
 iniatlly value will be 0 bcz still element is not added to the Hashmap
 when value is 1 i.e element is reapting so add it to array
 
 */