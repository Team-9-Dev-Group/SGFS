import java.util.ArrayList;

public class achievement extends Student{
    ArrayList<String> academicAchievements ;
    ArrayList<String> non_academicAchievements;
    public void addAcademicAchievement(String s)
    {
        academicAchievements.add(s);
    }
    public void addNonAcademicAchievement(String n)
    {
        non_academicAchievements.add(n);
    }
    public ArrayList<String> showAcademicAchievements()
    {
        return academicAchievements;
    }
    public ArrayList<String> showNonAcademicAchievements()
    {
        return non_academicAchievements;
    }
    public ArrayList<String> showAchievements()
    {
        ArrayList<String> achievements;
        achievements = academicAchievements ;
        for(int i=0;i<non_academicAchievements.size();i++)
        {
            achievements.add(non_academicAchievements.get(i));
        }
        return achievements;
    }

}
