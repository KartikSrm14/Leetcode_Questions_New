class Solution {
    public int[] twoSum(int[] nums, int target) {
        return two(nums,target);
    }

    public static int[] two(int[] arr,int target){
        int[] last = new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    last[0] = i;
                    last[1] = j;
                    return last;
                }
            }
        }
        return last;
    }
}