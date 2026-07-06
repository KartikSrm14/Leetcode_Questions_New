class Solution {
    public int searchInsert(int[] nums, int target) {
        return Insert(nums, target);
        
    }
    public static int Insert(int[] arr, int target) {
		for (int i=0; i<arr.length; i++) {
			if(arr[i] >= target) {
				return i;
			}
		}
		return arr.length;
	}
}