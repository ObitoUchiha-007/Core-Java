package com.Encapsulation;

class Student{
	//Declare variables
	private String usn;
	private String name;
	private float per;
	
	//2. Constructor
	public Student(String usn, String name, float per) {
		super();
		this.usn = usn;
		this.name = name;
		this.per = per;
	}
	
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn)
	{
		this.usn=usn;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public float getPer()
	{
		return per;
	}
	public void setPer(Float per)
	{
		this.per=per;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Student ob=new Student("R2023069","TEJAS", 90);
		System.out.println("NAME: "+ob.getUsn());
		System.out.println("USN:"+ob.getUsn());
		System.out.println("PERCENTAGE:"+ob.getPer());

	}

}
