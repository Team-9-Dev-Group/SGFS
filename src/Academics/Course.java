package Academics;

public class Course
{
	private String Department;
	private String Instructor1;
	private String Instructor2;
	private String Code;
	private int Credits;
	private String Time_Code;
	
	// Getters And Setters
	
	public void set_Department ( String department )
	{
		this.Department = department;
	}
	
	public String get_Department ()
	{
		return Department;
	}
	
	public void set_Instructor_1 ( String instructor_1 )
	{
		this.Instructor1 = instructor_1;
	}
	
	public String get_Instructor_1 ()
	{
		return Instructor1;
	}
	
	public void set_Instructor_2 ( String instructor_2 )
	{
		this.Instructor2 = instructor_2;
	}
	
	public String get_Instructor_2 ()
	{
		return Instructor2;
	}
	
	public void set_Code ( String code )
	{
		this.Code = code;
	}
	
	public String get_Code ()
	{
		return Code;
	}
	
	public void set_Credits ( int credits )
	{
		this.Credits = credits;
	}
	
	public int get_Credits ()
	{
		return Credits;
	}
	
	public void set_Time_Code ( String time_code )
	{
		this.Code = time_code;
	}
	
	public String get_Time_Code ()
	{
		return Time_Code;
	}
}