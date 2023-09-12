class ImplementStrStr {
    public int strstr(String A, String B) {
        if (A.length() == 0 || B.length() == 0 || B.length() > A.length())
            return -1;
        if (A.length() == B.length()) {
            if (A.compareTo(B) == 0)
                return 0;
            return -1;
        }
        int ans = -1;
        int lengthB = B.length();
        for (int i = 0; i <= A.length() - lengthB; i++) {
            if (Character.compare(A.charAt(i), B.charAt(0)) != 0)
                continue;
            String s = A.substring(i, i + lengthB);
            if (s.compareTo(B) == 0)
                return i;
        }
        return ans;
    }
}