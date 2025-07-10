package arrayList;
import java.util.*;
public class studentDriver {
public static void main(String[] args) {
    ArrayList<student> students = new ArrayList<>();
    students.add(new student("A", 10, 200));
    students.add(new student("c", 17, 800));
    students.add(new student("v", 16, 300));
    students.add(new student("Abb", 50, 20340));

    // Uncomment to test contains()
    // student tar = new student("v", 16, 300);
    // System.out.println(students.contains(tar)); // should return true if equals is correctly implemented

    

    for(int i=0;i<students.size();i++) {
        System.out.println(students.get(i));
    
    }    Collections.sort(students);
    System.out.println(students);

    
}
}
