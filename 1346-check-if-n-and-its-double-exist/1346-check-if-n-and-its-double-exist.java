class Solution {
    public boolean checkIfExist(int[] arr) {
        return check(arr);
    }

    public static boolean check(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i] == 2*arr[j] && i!=j){
                    count++;
                }
            }
        }
        if(count >= 1){
            return true;
        }
        else{
            return false;
        }
    }
}