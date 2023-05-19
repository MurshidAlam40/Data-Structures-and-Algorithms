class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        /*
        int ans[] = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[1] = i;
                    ans[0] = j;
                    return ans;
                }
            }
        }
        return ans;
        */
        int ans[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            int tar = target - nums[i];
            if(map.containsKey(tar)){
                ans[0] = map.get(tar);
                ans[1] = i;
                return ans;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
