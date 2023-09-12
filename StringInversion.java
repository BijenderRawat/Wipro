class StringInversion {
    public String solve(String A) {
        StringBuilder ans = new StringBuilder();
        for (char ch : A.toCharArray()) {
            if (Character.isLowerCase(ch))
                ans.append(Character.toUpperCase(ch));
            else
                ans.append(Character.toLowerCase(ch));
        }
        return ans.toString();
    }
}