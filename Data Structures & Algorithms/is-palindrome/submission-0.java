class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder strbud = new StringBuilder();

        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') ||
                (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z')) {
                strbud.append(c);
            }
        }

        String str = strbud.toString().toLowerCase();
        String strrev = new StringBuilder(str).reverse().toString();

        return str.equals(strrev);
    }
}