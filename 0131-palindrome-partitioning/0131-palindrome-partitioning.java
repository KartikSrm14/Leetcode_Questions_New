class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        Partition(s, ll, ans);
        return ans;
    }
    public void Partition(String ques, List<String> ll, List<List<String>> ans) {
        if (ques.length() == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int cut = 1; cut <= ques.length(); cut++) {
            String sub = ques.substring(0, cut);
            if (isPalindrome(sub)) {
                ll.add(sub);
                Partition(ques.substring(cut), ll, ans);
                ll.remove(ll.size() - 1); 
            }
        }
    }
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}