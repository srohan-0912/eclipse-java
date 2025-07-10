package jun14Comparator;

import java.util.Comparator;
public class typeComparator implements Comparator {
	
public int compare(Object o1,Object o2) {
	shoe s1=(shoe)o1;
	shoe s2=(shoe)o2;
	
	return s1.type.compareTo(s2.type);
}
}
