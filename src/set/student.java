package set;

import java.util.HashSet;
import java.util.Objects;

//STUDENT USING LIST
public class student implements Comparable{
String name;
int rollno;
public student(String name, int rollno) {
	super();
	this.name = name;
	this.rollno = rollno;
}
@Override
public String toString() {
	return "student [name=" + name + ", rollno=" + rollno + "]";
}
@Override
public int hashCode() {
	return Objects.hash(name, rollno);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	student other = (student) obj;
	return Objects.equals(name, other.name) && rollno == other.rollno;
}
@Override
public int compareTo(Object o) {
	student s1=(student)o;
	return this.name.compareToIgnoreCase(s1.name);
}

}
