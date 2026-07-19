class Solution {
    public void sortColors(int[] nums) {
        color(nums);
    }

    public static void color(int[] arr){
        int n = arr.length;
        int red =0;
        int white = 0;
        int blue=0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                red++;
            }
            else if(arr[i] == 1){
                white++;
            }
            else{
                blue++;
            }
        }
        for(int i=0;i<red; i++){
            arr[i] = 0;
        }
          for(int i=red;i<red+white; i++){
            arr[i] = 1;
        }
          for(int i=red+white;i<n; i++){
            arr[i] = 2;
        }
    }
}