package set;

import java.util.Collections;
import java.util.HashSet;

public class carDriver {
	public static void main(String[] args) {
        HashSet<car> c = new HashSet<>();

        c.add(new car("A", 1000));
        c.add(new car("B", 2000));
        c.add(new car("C", 4000));
       ArrayList a1=new ArrayList();
        a1.add(c);
        Collections.sort(a1);
        for (car a : c) {
            System.out.println(a);
        }
    }
}
