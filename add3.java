class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if (nums.length < 3)
            return new ArrayList<>();
        Set<List<Integer>> sol = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i< nums.length-2; i++)
        {
            int j = i+1;
            int k = nums.length-1;
            while (j < k) {
                int sum =nums[i]+nums[j]+nums[k];
                if (sum == 0)
                {
                    sol.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                    //increment j & k (both is ok) so we will not be stuck in a loop
                }
                else if (sum<0) {
                    j++;
                }
                else if (sum>0)
                {
                    k--;
                }
            }
        }
        return new ArrayList<>(sol);

    }
}
