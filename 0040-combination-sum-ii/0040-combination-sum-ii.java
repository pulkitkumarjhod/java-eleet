class Solution {
     public void helper(int candidates[],int curr,int n,int sum,List<Integer> arr, List<List<Integer>> ans,int target) {
        if(sum>target) {
            return;
        } else if(sum==target) {
            List<Integer> temp = new ArrayList<Integer>(arr);
            ans.add(temp);
            return;
        }
        int i = curr;
        while(i<n && sum+candidates[i]<=target) {
            arr.add(candidates[i]);
            helper(candidates,i+1,n,sum+candidates[i],arr,ans,target);
            arr.remove(arr.size()-1);
            if(candidates[i]+sum==target) {
              return;
            }
            while(i<n-1 && candidates[i]==candidates[i+1]) {
                i++;
            }
            i++;
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(candidates,0,candidates.length,0,new ArrayList<Integer>(),ans,target);
        return ans;
    }
}