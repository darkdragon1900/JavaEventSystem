package program;

public class Faculty extends Person {

	protected String teachingSub;
	protected double sal;
	
	public Faculty() {
		// TODO Auto-generated constructor stub
	}

	public Faculty(int id, String name, String teachingSub, double sal) {
		super(id, name);
		this.teachingSub = teachingSub;
		this.sal = sal;
	}

	public String getTeachingSub() {
		return teachingSub;
	}

	public void setTeachingSub(String teachingSub) {
		this.teachingSub = teachingSub;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public void toTeach()
	{
		System.out.println("prof."+name +" is teaching "+teachingSub+" subject");
		System.out.println(name + " is having salary of "+sal+" Rs. Per Month");
	}

	@Override
	public String toString() {
		return "Faculty [teachingSub=" + teachingSub + ", sal=" + sal + ", id=" + id + ", name=" + name + "]";
	}
	
	 
	
	
	
}
