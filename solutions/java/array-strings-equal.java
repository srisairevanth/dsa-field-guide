class Solution {
    public boolean arrayStringsEqual(String[] a, String[] b) {
        return String.join("", a).equals(String.join("", b));
    }
}
