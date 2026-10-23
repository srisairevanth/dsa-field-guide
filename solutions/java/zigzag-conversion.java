class Solution {
    public String zigzag(String s, int rows) {
        if (rows <= 1 || rows >= s.length()) return s;
        StringBuilder[] lines = new StringBuilder[rows];
        for (int r = 0; r < rows; r++) lines[r] = new StringBuilder();
        int row = 0, step = 1;
        for (char ch : s.toCharArray()) {
            lines[row].append(ch);
            if (row == 0) step = 1;
            else if (row == rows - 1) step = -1;
            row += step;
        }
        StringBuilder out = new StringBuilder();
        for (StringBuilder line : lines) out.append(line);
        return out.toString();
    }
}
