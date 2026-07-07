class Solution {
    public int countSymmetricIntegers(int low, int high) {
        return Sum(low, high);
    }

    public static int Sum(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            String s = Integer.toString(i);
            int n = s.length();

            if (n % 2 == 0) {
                int left = 0;
                int right = n - 1;

                int sum1 = 0;
                int sum2 = 0;

                while (left < right) {
                    sum1 += s.charAt(left) - '0';
                    sum2 += s.charAt(right) - '0';
                    left++;
                    right--;
                }

                if (sum1 == sum2) {
                    count++;
                }
            }
        }

        return count;
    }
}