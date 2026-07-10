class Solution {
    public int hammingDistance(int x, int y) {
        int ans=0;
        int xor=x^y;
        String binary = Integer.toBinaryString(xor);
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1')ans++;
        }
        return ans;
    }
}