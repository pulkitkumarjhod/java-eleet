class Solution {
    public static int[] searchRange(int[] nums,int target)
    {
        int[] ans=new int[2];
        ans[0]=findIndex(nums,target,true);
        ans[1]=findIndex(nums,target,false);
        return ans;
    }



    public static int findIndex(int [] nums,int target,boolean wantfirstindex)
    {
        int firstindex=0,lastindex=nums.length-1;
        int ans=-1;
        while(firstindex <= lastindex)
        {
            // (firstindex+lastindex) can exceed the value of integer in the case of mid=(firstindex+lastindex)/2; 

            int mid=firstindex-(firstindex-lastindex)/2;

            if (target < nums[mid])
            {
                lastindex=mid-1;
            }

            else if(target > nums[mid])
            {   
                firstindex=mid+1;
            }

            else
            {
                ans=mid;
                if(wantfirstindex) //this is always true[[]()]()
                {
                    lastindex=mid-1;
                }

                else
                {
                    firstindex=mid+1;
                }
            }
        }
        return ans;
    }
}