import java.util.ArrayList;
import java.util.LinkedList;

public class Semester {

    int year;
    String semester;
    String department;

    ArrayList<String> coursesTaken = new ArrayList<>();
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
    public void addAchievement(){
        achievement Achievement= new achievement();
        //TODO: add something according to Achievements class
        achievementsArrayList.add(Achievement);
    }
    public void removeAchievement(String Name)
    {
        for(int i=0;i<achievementsArrayList.size();i++)
        {
            if(achievementsArrayList.get(i).achievementName==Name)
            {
                achievementsArrayList.remove(i);
                break;
            }
        }
    }
    public void removeAchievement(String Name, int year)
    {
        for(int i=0;i<achievementsArrayList.size();i++)
        {
            if(achievementsArrayList.get(i).achievementName==Name && achievementsArrayList.get(i).achievementYear==year)
            {
                achievementsArrayList.remove(i);
                break;
            }
        }
    }

}
