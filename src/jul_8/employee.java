package jul_8;

import java.util.Objects;

public class employee { 
String	name;
int id;
int age;
String role;
int sal;
	public employee(String name, int id, int age, String role, int sal) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.role = role;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "[employee name=" + name + ", id=" + id + ", age=" + age + ", role=" + role + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(sal);
	}
	@Override
	public boolean equals(Object obj) {
		employee e1=(employee)obj;
		if(this.sal != e1.sal) return false;
		return true;
	}
	
	
	
}
