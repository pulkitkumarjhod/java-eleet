/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    private TreeNode helper(int[] nums,int l, int h){
        if(l > h){
            return null;
        }
        int m = l + ((h-l) >> 1);
        TreeNode node = new TreeNode(nums[m]);
        node.left = helper(nums,l,m-1);
        node.right = helper(nums,m+1,h);
        return node;
    }
}