class TwoStores {
    public int solve(int A, int B, int C, int D, int E) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= A / B; i++)
            if ((A - i * B) % D == 0)
                min = Math.min(min, i * C + (A - i * B) / D * E);
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
