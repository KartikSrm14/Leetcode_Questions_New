class Solution {
    static String[] key = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        ArrayList<String> l1 = new ArrayList<>();
        if(digits.length() == 0) return l1;

        keypad(digits, "", l1);
        return l1;
    }

    public static void keypad(String ques, String ans, ArrayList<String> l1) {
        if(ques.length() == 0) {
            l1.add(ans);
            return;
        }

        char ch = ques.charAt(0);          // '2'
        String get = key[ch - '0'];        // "abc"

        for(int i = 0; i < get.length(); i++) {
            keypad(ques.substring(1), ans + get.charAt(i), l1);
        }
    }
}