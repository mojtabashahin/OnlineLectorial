
public class Student {
	private int ID;
	private String fullname;
	public Student (int studentID, String studentFullname)
	{
		ID = studentID;
		fullname= studentFullname;
	}

	public static void main(String[] args) {
		Student student = new Student (8123, "Test");

	}

}
