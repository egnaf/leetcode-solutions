package solutions.problem1528;

// c o d e l e e t
// 4 5 6 7 0 2 1 3

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }
}
