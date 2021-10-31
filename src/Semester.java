import java.util.ArrayList;
import java.util.LinkedList;

public class Semester {

    int year;
    String semester;
    String department;

    ArrayList<String> coursesTaken = new ArrayList<>();
    ArrayList<Achievements> achievementsArrayList = new ArrayList<Achievements>();
    LinkedList<Exam> examLinkedList = new LinkedList<Exam>();
    
    //Getters and setters
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSemester() {
        return semester;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    //Adding objects to achievementsArrayList
    public void addAchievement(){
        Achievements achievement = new Achievements();
        //TODO: add something according to Achievements class
        achievementsArrayList.add(achievement);
    }
    
    
    // Course List method 
    
    static Course[] Sem_1 = new Course[8];
    static Course[] Sem_2 = new Course[8];
    static Course[] Sem_3 = new Course[9];
    static Course[] Sem_4_CSE = new Course[9];
    static Course[] Sem_4_IT = new Course[9];
    static Course[] Sem_5_CSE = new Course[8];
    static Course[] Sem_5_IT = new Course[9];
    static Course[] Sem_6_CSE = new Course[8];
    static Course[] Sem_6_IT = new Course[7];
    static Course[] Sem_7_CSE = new Course[7];
    static Course[] Sem_7_IT = new Course[7];
    static Course Sem_8 = new Course();                        //Sem 8 has only Project.
    
    static String str = "Optional Course";
    
    static String[] Sem_1_Courses = new String[] {"MA101","PH100","PH160","IT101","IT161","EC100","EC160","HS101"};
    static String[] Sem_2_Courses = new String[] {"MA102","PH110","PH170","EE100","EE160","CS102","CS162","HS102"};
    static String[] Sem_3_Courses = new String[] {"SC201","MA201","HS201","CS201","CS261","CS203","CS263","EC201","EC261"};
    static String[] Sem_4_Courses_CSE = new String[] {"MA202","HS202","CS202","CS204","CS262","CS206","CS266","CS208","CS268"};
    static String[] Sem_4_Courses_IT = new String[] {"HS202","IT202","IT262","CS204","CS262","CS206","CS266","CS208","CS268"};
    static String[] Sem_5_Courses_CSE = new String[] {"CS301","CS361","CS303","CS363","CS305",str,str,"CS391"};
    static String[] Sem_5_Courses_IT = new String[] {"CS301","CS361","CS303","CS363","IT301","IT361",str,str,"IT391"};
    static String[] Sem_6_Courses_CSE = new String[] {"CS302","CS362","CS304","CS364",str,str,str,str};
    static String[] Sem_6_Courses_IT = new String[] {"IT302","IT362","IT304",str,str,str,str};
    static String[] Sem_7_Courses_CSE = new String[] {"CS401","CS461",str,str,str,str,"CS491"};
	static String[] Sem_7_Courses_IT = new String[] {"IT401","IT461",str,str,str,str,"IT491"};
	static String[] Sem_8_Courses = new String[] {"Project"};
    
    static                                                     //This block must be executed.
    {
    	for ( int i = 0 ; i < 9 ; i++ )                        //Initialization of Objects.
        {
    		Sem_3[i] = new Course();
    		
    		Sem_4_CSE[i] = new Course();
    		
    		Sem_4_IT[i] = new Course();
    		
    		Sem_5_IT[i] = new Course();
    		
    		if ( i < 8 )
        	{
    			Sem_1[i] = new Course();
    			
    			Sem_2[i] = new Course();
    			
    			Sem_5_CSE[i] = new Course();
    			
    			Sem_6_CSE[i] = new Course();
        	}
        	
        	if ( i < 7 )
        	{
        		Sem_6_IT[i] = new Course();
        		
        		Sem_7_CSE[i] = new Course();
        		
        		Sem_7_IT[i] = new Course();
        	}
        }
    	
		set_CourseList( Sem_1 , Sem_1_Courses );
		set_CourseList( Sem_2 , Sem_2_Courses );
		set_CourseList( Sem_3 , Sem_3_Courses );
		set_CourseList( Sem_4_CSE , Sem_4_Courses_CSE );
		set_CourseList( Sem_4_IT , Sem_4_Courses_IT );
		set_CourseList( Sem_5_CSE , Sem_5_Courses_CSE );
		set_CourseList( Sem_5_IT , Sem_5_Courses_IT );
		set_CourseList( Sem_6_CSE , Sem_6_Courses_CSE );
		set_CourseList( Sem_6_IT , Sem_6_Courses_IT );
		set_CourseList( Sem_7_CSE , Sem_7_Courses_CSE );
		set_CourseList( Sem_7_IT , Sem_7_Courses_IT );
    	Sem_8.set_Code("Project");
    }
    
    private static void set_CourseList( Object[] Sem , String[] Courses )    
    {
    	for ( int i = 0 ; i < 9 ; i++ )
    	{
    		if ( Sem.length == 8 )
    		{
    			if ( i == 8 )
    			break;
    		}
    		
    		if ( Sem.length == 7 )
    		{
    			if ( i == 7 )
        		break;
    		}
    		
    		((Course) Sem[i]).set_Code(Courses[i]);
    	}
    }
    
    private static String[] return_CourseList( Object[] Sem )
    {
    	String[] str = new String[Sem.length];
    	for ( int i = 0 ; i < Sem.length ; i++ )
    		str[i] = ((Course) Sem[i]).get_Code();
    	
    	return str;
    }
    
    public String[] create_CourseList( int year , String semester , String department )
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
				return return_CourseList(Sem_1);
			case 2 :
				return return_CourseList(Sem_2);
			case 3 :
				return return_CourseList(Sem_3);
			case 4 :
				if ( department == "CSE" )
				return return_CourseList(Sem_4_CSE);
				if ( department == "IT" )
				return return_CourseList(Sem_4_IT);
			case 5 :
				if ( department == "CSE" )
					return return_CourseList(Sem_5_CSE);
				if ( department == "IT" )
					return  return_CourseList(Sem_5_IT);
			case 6 :
				if ( department == "CSE" )
					return return_CourseList(Sem_6_CSE);
				if ( department == "IT" )
					return  return_CourseList(Sem_6_IT);
			case 7 :
				if ( department == "CSE" )
					return return_CourseList(Sem_7_CSE);
				if ( department == "IT" )
					return  return_CourseList(Sem_7_IT);
			case 8 :
				return Sem_8_Courses;
				
			default :
				return null;
		}
    }

}
