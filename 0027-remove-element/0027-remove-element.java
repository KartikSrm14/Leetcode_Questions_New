class Solution {
    public int removeElement(int[] nums, int val) {
        return Remove(nums, val);
    }
    public static int Remove(int[] arr, int val) {
		int k = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != val) {
				arr[k] = arr[i];
				k++;
			}
		}
		return k;
	}
}