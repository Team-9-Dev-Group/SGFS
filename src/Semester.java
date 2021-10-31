import java.util.*;

public class Semester {

    int year;
    String semester;
    String department;

    ArrayList<Course> CoursesList = new ArrayList<Course>();
    ArrayList<achievement> achievementsArrayList = new ArrayList<achievement>();
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

    public void addAchievement(String name){
        achievement Achievement= new achievement(name);
        //TODO: add something according to Achievements class
        achievementsArrayList.add(Achievement);
    }
    public void addAchievement(String name,Date date)
    {
        achievement Achievement = new achievement(name,date);
        achievementsArrayList.add(Achievement);
    }
    public void addAchievement(String name,Date date,String type)
    {
        achievement Achievement = new achievement(name,date,type);
        achievementsArrayList.add(Achievement);
    }
    public void removeAchievement(String Name)
    {
        for(int i=0;i<achievementsArrayList.size();i++)
        {
            if(achievementsArrayList.get(i).titleOfAchievement ==Name)
            {
                achievementsArrayList.remove(i);
                break;
            }
        }
    }
    public void removeAchievement(String Name, Date date)
    {
        for(int i=0;i<achievementsArrayList.size();i++)
        {
            if(achievementsArrayList.get(i).titleOfAchievement ==Name && achievementsArrayList.get(i).achievementDate==date)
            {
                achievementsArrayList.remove(i);
                break;
            }
        }
    }
    
    public boolean modifyAchievement(String name,Date date,String type, String worth)
    {
        //searching with name and modifying other details
        for(int i=0;i<achievementsArrayList.size();i++)
        {
            if(achievementsArrayList.get(i).titleOfAchievement==name)
            {
                achievementsArrayList.get(i).setAchievementInfo(date, type, worth);
                return true;
            }
        }
        return false;
    }

    
    // Course List method 
    
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
    
    private void set_CourseList( String[] courses )    
    {
    	for ( int i = 0 ; i < courses.length ; i++ )
    	{	
    		Course name = new Course();
    		name.set_Code(courses[i]);
    		CoursesList.add(name);
    	}
    }
    
    public void create_CourseList( int year , String semester , String department )
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
				set_CourseList(Sem_1_Courses);
				break;
			case 2 :
				set_CourseList(Sem_2_Courses);
				break;
			case 3 :
				set_CourseList(Sem_3_Courses);
				break;
			case 4 :
				if ( department == "CSE" )
				set_CourseList(Sem_4_Courses_CSE);
				else if ( department == "IT" )
				set_CourseList(Sem_4_Courses_IT);
				break;
			case 5 :
				if ( department == "CSE" )
				set_CourseList(Sem_5_Courses_CSE);
				else if ( department == "IT" )
				set_CourseList(Sem_5_Courses_IT);
				break;
			case 6 :
				if ( department == "CSE" )
				set_CourseList(Sem_6_Courses_CSE);
				else if ( department == "IT" )
				set_CourseList(Sem_6_Courses_IT);
				break;
			case 7 :
				if ( department == "CSE" )
				set_CourseList(Sem_7_Courses_CSE);
				else if ( department == "IT" )
				set_CourseList(Sem_7_Courses_IT);
				break;
			case 8 :
				set_CourseList(Sem_8_Courses);
				break;

			default :
				System.out.println("Invalid Input");
				
		}
    }
    
    
    
    //Methods for Exam Class
    
    public void listExams() {
        // Right now it will just print out the examLinkedList
        for (Exam exam : examLinkedList) {
            System.out.println("Course - " + exam.getCourse());
            System.out.println("Exam type - " + exam.getExamType());
            System.out.println("Date - " + exam.getDate());
            System.out.println("Maximum Marks - " + exam.getMaxMarks());
            System.out.println("Weightage in final score (%)  - " + exam.getWeightage());
            System.out.println("Obtained Marks - " + exam.getObtMarks());
            System.out.println("Proctored - " + exam.getProctored());
            System.out.println("\n");
        }
    }

    public Boolean modifyExam(String course, String exam_type, String date, String max_marks, String weightage, String obt_marks, Boolean proctored) {
        for (int i = 0; i < examLinkedList.size(); i++) {
            if (examLinkedList.get(i).getCourse().equals(course) && examLinkedList.get(i).getExamType().equals(exam_type) && examLinkedList.get(i).getDate().equals(date)) {
                examLinkedList.set(i, new Exam(course, exam_type, date, max_marks, weightage, obt_marks, proctored));
                return true; // exam found and modified
            }
        }
        return false; // exam not found
    }


}
