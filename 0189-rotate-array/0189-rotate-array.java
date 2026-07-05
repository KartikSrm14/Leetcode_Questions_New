class Solution {
    public void rotate(int[] nums, int k) {
        Rotate(nums,k);
    }

    public static void Rotate(int[] arr, int k){
        int n = arr.length;
         k = k%n;
        Rev(arr,0,n-1);
        Rev(arr,0,k-1);
        Rev(arr,k,n-1);
    }

    public static void Rev(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }
    }
}


