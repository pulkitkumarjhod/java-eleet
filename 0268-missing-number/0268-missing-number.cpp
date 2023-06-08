class Solution 
{
public:
    int missingNumber(vector<int>& nums) 
    {
        ios_base::sync_with_stdio(0);
        cin.tie(0);

        int n = nums.size();
        int expSum = n*(n+1)/2;

        int sum =0 ;
        for(int i:nums)sum+=i;

        return expSum - sum;   
    }
};