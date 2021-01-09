import java.math.*;
import java.util.*;

import static java.lang.Math.*;

public class DivideLoot {

    public String verify(int N, int[] loot) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < loot.length; i++) {
            set.add(loot[i]);
            for (int j = i + 1; j < loot.length; j++) {
                set.add(loot[i] + loot[j]);
            }
        }
        for (int i : set) {
            System.err.println(i);
        }
        return null;
    }
}
