class Solution {
    public boolean isRotation(String a, String b) {
        return a.length() == b.length() && (a + a).contains(b);
    }
}
