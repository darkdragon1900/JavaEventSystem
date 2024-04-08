package program;

public class Student extends Person {
	
	protected String course;
	protected double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, String course, double marks) {
		super(id, name);
		this.course = course;
		this.marks = marks;
	}


	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void tolearn()
	{
		System.out.println(name +" is Studying "+course+" and got "+marks);
	}

	@Override
	public String toString() {
		return "\n********Student Details********\n "
				+ "\nStudent Course=" + course 
				+ "\nStudents Marks=" + marks 
				+ " \nStudent id=" + id 
				+ "\nStudents name=" + name
				+"\n___________________________\n";
	}
	
	

}
