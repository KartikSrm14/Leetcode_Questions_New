class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        return mid(nums);
    }

    public static boolean mid(int[] arr){
        int midval = arr[(arr.length/2)];
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == midval){
                count++;
            }
        }
        if(count>1){
            return false;
        }
        else{
            return true;
        }
    }
}