import java.util.ArrayList;
import java.util.HashMap;

public class Ditro {
    Ditro() {
        solve(new int[] {1, 4, 4, 3, 4});
        System.out.println(pick(4));
    }

    HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

    void solve(int[] num) {
        for (int i=0; i<num.length; i++) {
            if (hm.containsKey(num[i])) {
                ArrayList<Integer> tmp = hm.get(num[i]);
                tmp.add(i);
                hm.replace(num[i], tmp);
            } else {
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(i);
                hm.put(num[i], tmp);
            }
        }
    }

    int pick(int i) {
        ArrayList<Integer> tmp = hm.get(i);
        int res = (int) (tmp.size() * Math.random());
        return tmp.get(res);
    }
}
