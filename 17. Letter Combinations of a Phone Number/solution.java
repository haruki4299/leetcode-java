class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        dfs(digits, map, res, new StringBuilder(), 0);
        return res;
    }
    
    private void dfs(String digits, Map<Character, String> map, List<String> res, StringBuilder sb, int index) {
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            dfs(digits, map, res, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
