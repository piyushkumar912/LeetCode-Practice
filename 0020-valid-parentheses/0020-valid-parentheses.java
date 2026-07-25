class Solution {
    public boolean isValid(String s) {
         while (s.length() > 0) {

            int len = s.length();

            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");

            if (len == s.length()) {
                return false;
            }
        }

        return true;
    }
}