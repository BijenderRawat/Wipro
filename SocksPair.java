import java.util.ArrayList;
import java.util.HashMap;

class SocksPair {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        int count = 0;
        for (int key : map.keySet())
            count += map.get(key) / 2;
        return count;
    }
}