class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return Product(nums, k);
    }

    	public static int Product(int[] arr, int k) {
		int si=0, ei=0, p=1, ans=0;
		while(ei<arr.length) {
			//window grow
			p=p*arr[ei];
			
			//Maximum sum
			while(p>=k && si<=ei) {
				p = p/arr[si];
				si++;
			}
			//answer update
			ans = ans + (ei -si+1);
			ei++;
		}
		return ans;
		
	}
}