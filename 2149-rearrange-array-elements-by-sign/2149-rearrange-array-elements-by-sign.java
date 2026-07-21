class Solution {
    public int[] rearrangeArray(int[] nums) {
        return zoey(nums);
    }

    public static int[] zoey(int[] arr){
        int[] ans = new int[arr.length];
        int even =0;
        int odd =1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                ans[even] = arr[i];
                even += 2;
            }
            else{
                ans[odd] = arr[i];
                odd+=2;
            }
        }
     
        return ans;
    }
}