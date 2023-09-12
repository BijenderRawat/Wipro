class PythagoreanTriplet {
    public int solve(int A) {
        int count = 0, a = 1, b = 1;
        while (a <= A && b <= A) {
            int c = (int) Math.sqrt(a * a + b * b);
            if (c * c == a * a + b * b && c <= A)
                count++;
            b++;
            if (b > A) {
                a++;
                b = a;
            }
        }
        return count;
    }
}