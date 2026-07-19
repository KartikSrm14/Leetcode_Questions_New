class Solution {
    public int majorityElement(int[] nums) {
        return zoey(nums);
    }

    public static int zoey(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}