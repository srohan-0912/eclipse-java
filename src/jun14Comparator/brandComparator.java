package jun14Comparator;
import java.util.Comparator;
public class brandComparator implements Comparator{
	@Override
public int compare(Object o1,Object o2) {
	shoe s1=(shoe)o1;
	shoe s2=(shoe)o2;
	return s1.brand.compareTo(s2.brand);
}
}
