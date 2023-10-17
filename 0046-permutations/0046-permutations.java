class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
		helper(nums, list, new ArrayList<>());
		return list;
    }
    public static void helper(int nums[], List<List<Integer>> list, List<Integer> dummy) {
		if (dummy.size() == nums.length) {
			list.add(new ArrayList<>(dummy));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (dummy.contains(nums[i]))
				continue;
			dummy.add(nums[i]);
			helper(nums, list, dummy);
			dummy.remove(dummy.size() - 1);
		}
	}
}