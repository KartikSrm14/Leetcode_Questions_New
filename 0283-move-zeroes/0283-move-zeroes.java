class Solution {
    public void moveZeroes(int[] nums) {
        zero(nums);
    }

    public static void zero(int[] arr){
        int normal =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                normal++;
            }
        }

        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0 && sum < normal){
                arr[sum] = arr[i];
                sum++; 
            }
        }
        for(int i=normal; i<arr.length; i++){
            arr[i] = 0;
        }
    }

}