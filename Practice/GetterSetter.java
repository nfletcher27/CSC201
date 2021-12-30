// Student class
public class Student {

	String name;
	int age;
	int grade;

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName(String name) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void studentData() {
		System.out.println(this.name + " is in grade " + this.grade + " and is " + this.age + " years old.");
	}
	
}

// Main method
public class Main {
	public static void main(String[] args) {
		
	Student jeff = new Student("Jeff", 17, 12);
	Student mary = new Student("Mary", 18, 12);
	
	
	mary.studentData();
	jeff.studentData();
	
	}
}
