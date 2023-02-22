package week5.day1;

public class Student extends Department {

	public static void main(String[] args) {
		Student std=new Student();
		std.collegeName("St.Joseph's");
		std.collegeCode(3124);
		std.collegeRank(12);
		std.deptName("EEE");
		std.studentName("Ram");
		std.studentDept("EEE");
		std.studentId(1214);

	}
	public void studentName(String name) {
		System.out.println("Student name is "+name);
	}
	public void studentDept(String dept) {
		System.out.println("Student department is "+dept);
	}
	public void studentId(int id) {
		System.out.println("Student id is "+id);
	}

}
