class PalindromicTime {
    public String reverse(String m) {
        String ans = "";
        for (int i = m.length() - 1; i > -1; i--)
            ans += m.charAt(i);
        return ans;
    }

    public boolean compare(int hh, int mm) {
        String h = String.valueOf(hh);
        if (h.length() == 1)
            h = "0" + h;
        String m = String.valueOf(mm);
        if (m.length() == 1)
            m = "0" + m;
        return h.compareTo(reverse(m)) == 0 ? true : false;
    }

    public int solve(String A) {
        if (A.charAt(0) == A.charAt(4) && A.charAt(1) == A.charAt(3))
            return 0;
        int hh = Integer.parseInt(A.charAt(0) + "" + A.charAt(1));
        int mm = Integer.parseInt(A.charAt(3) + "" + A.charAt(4));
        int count = 0;
        while (true) {
            if (compare(hh, mm))
                break;
            mm++;
            if (mm == 60) {
                hh++;
                mm = 0;
                if (hh == 24)
                    hh = 0;
            }
            count++;
        }
        return count;
    }
}
