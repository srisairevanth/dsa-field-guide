class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder kept = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) kept.append(Character.toLowerCase(ch));
        }
        String forward = kept.toString();
        String backward = kept.reverse().toString();
        return forward.equals(backward);
    }
}
