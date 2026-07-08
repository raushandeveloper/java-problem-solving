package Maps_And_Sets;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets_STL {
    static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(34); set.add(56); set.add(21); set.add(24);set.add(19);
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(24)+" "+set.contains(18));
        set.remove(56);
        System.out.println(set.contains(56));
        System.out.println(set.size());
    }
}
