class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length,sum;
        int a[]=new int[2];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
               
                if(i!=j&&nums[i]+nums[j]==target)
                {
                    a[0]=i;
                    a[1]=j;
                   return a;

                }
            }
        }
       return a;
    }
}
