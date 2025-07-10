package arrayList;

public class student implements Comparator,Comparable{
String name;
int age;
int rollno;

public student(String name, int age, int rollno) {
	super();
	this.name = name;
	this.age = age;
	this.rollno = rollno;
}
@Override
public String toString() {
    return "student name=" + name + ", age=" + age + ", rollno=" + rollno;
}
@Override
public boolean equals(Objects o) {
    student s1=(student)o;
    if(this.name !=s1.name) return false;
    if(this.age != s1.age) return false;
    if(this.rollno != s1.rollno) return false;
    return true;
}
//@Override
//public int compareTo(Object o) {
//	student s1=(student)o;
//	return this.name.compareToIgnoreCase(s1.name);
//}
@Override
public int compare(Object o1,Object o2) {
	student s1=(student)o1;
	student s2=(student)o2;
	
	
    return s1.age-s2.age;  // Sorting by age (ascending)
}
}
