import java.util.ArrayList;

class MultipleLeftRotationsOfTheArray {
    public ArrayList<Integer> leftrotate(ArrayList<Integer> A, int i) {
        ArrayList<Integer> ans = new ArrayList<>(A.subList(i, A.size()));
        ans.addAll(A.subList(0, i));
        return ans;
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i : B)
            ans.add(leftrotate(A, i % A.size()));
        return ans;
    }
}