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
	
	// Course List method for Semester class
	
	String str = "Optional Course";
	
	String[] Sem_1_Courses = new String[] {"MA101","PH100","PH160","IT101","IT161","EC100","EC160","HS101"};
	String[] Sem_2_Courses = new String[] {"MA102","PH110","PH170","EE100","EE160","CS102","CS162","HS102"};
	String[] Sem_3_Courses = new String[] {"SC201","MA201","HS201","CS201","CS261","CS203","CS263","EC201","EC261"};
	String[] Sem_4_Courses_CSE = new String[] {"MA202","HS202","CS202","CS204","CS262","CS206","CS266","CS208","CS268"};
	String[] Sem_4_Courses_IT = new String[] {"HS202","IT202","IT262","CS204","CS262","CS206","CS266","CS208","CS268"};
	String[] Sem_5_Courses_CSE = new String[] {"CS301","CS361","CS303","CS363","CS305",str,str,"CS391"};
	String[] Sem_5_Courses_IT = new String[] {"CS301","CS361","CS303","CS363","IT301","IT361",str,str,"IT391"};
	String[] Sem_6_Courses_CSE = new String[] {"CS302","CS362","CS304","CS364",str,str,str,str};
	String[] Sem_6_Courses_IT = new String[] {"IT302","IT362","IT304",str,str,str,str};
	String[] Sem_7_Courses_CSE = new String[] {"CS401","CS461",str,str,str,str,"CS491"};
	String[] Sem_7_Courses_IT = new String[] {"IT401","IT461",str,str,str,str,"IT491"};
	String[] Sem_8_Courses = new String[] {"Project"};

	
	public String[] Course_List( int year , String semester , String department )
	{
		int Sem_No = 0 ;
		switch ( semester )
		{
			case "Autumn" :
				Sem_No = (year * 2) - 1 ;
				break;
			case "Winter" :
				Sem_No = year * 2 ;
				break;
			default :
			     System.out.println("Invalid Semester.");
		}
		
		switch ( Sem_No )
		{
			case 1 :
				return Sem_1_Courses;
			case 2 :
				return Sem_2_Courses;
			case 3 :
				return Sem_3_Courses;
			case 4 :
				if ( department == "CSE" )
				return Sem_4_Courses_CSE;
				if ( department == "IT" )
				return  Sem_4_Courses_IT;
			case 5 :
				if ( department == "CSE" )
					return Sem_5_Courses_CSE;
				if ( department == "IT" )
					return  Sem_5_Courses_IT;
			case 6 :
				if ( department == "CSE" )
					return Sem_6_Courses_CSE;
				if ( department == "IT" )
					return  Sem_6_Courses_IT;
			case 7 :
				if ( department == "CSE" )
					return Sem_7_Courses_CSE;
				if ( department == "IT" )
					return  Sem_7_Courses_IT;
			case 8 :
				return Sem_8_Courses;
				
			default :
				return null;
		}
	}
}
