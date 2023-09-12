import java.util.ArrayList;
import java.util.List;

class SpiralOrderMatrix1 {
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0, right = A.get(0).size() - 1, top = 0, bottom = A.size() - 1;
        int noofelement = (right + 1) * (bottom + 1);
        while (left <= right && top <= bottom && noofelement > 0) {
            for (int i = left; i <= right && noofelement > 0; i++) {
                ans.add(A.get(top).get(i));
                noofelement--;
            }
            for (int i = top + 1; i <= bottom && noofelement > 0; i++) {
                ans.add(A.get(i).get(right));
                noofelement--;
            }
            for (int i = right - 1; i >= left && noofelement > 0; i--) {
                ans.add(A.get(bottom).get(i));
                noofelement--;
            }
            for (int i = bottom - 1; i >= top + 1 && noofelement > 0; i--) {
                ans.add(A.get(i).get(left));
                noofelement--;
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return ans;
    }
}
