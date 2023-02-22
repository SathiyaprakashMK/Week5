package week5.day1;

public class Students {

	public static void main(String[] args) {
		Students std=new Students();
		std.getStudentInfo(1214);
		std.getStudentInfo(1214,"Ram");
		std.getStudentInfo(1214, "Ram", "ram@gmail.com", 1122334455);

	}
	public void getStudentInfo(int id) {
		System.out.println("Student id is "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is "+id+" and name is "+name);
	}
	public void getStudentInfo(int id, String name, String email, long phoneNumber) {
		System.out.println("Student id is "+id+" and name is "+name+" and email is "+email+" and phone number is "+phoneNumber);
	}

}
