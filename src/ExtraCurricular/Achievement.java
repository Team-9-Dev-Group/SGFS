package ExtraCurricular;

import java.util.Date;

public class Achievement {
    public String titleOfAchievement;
    public String achievementDate;
    public String achievementType; //academic or non academic
    public String achievementWorth; //gold silver bronze

    public Achievement(String name)
    {
        titleOfAchievement =name;
    }
    public Achievement(String name, String date)
    {
        this(name);
        this.achievementDate=date;
    }
    public Achievement(String name, String date, String type)
    {
        this(name,date);
        this.achievementType=type;
    }
    public void setAchievementInfo(String date, String type,String worth )
    {
        this.achievementDate=date;
        this.achievementType=type;
        this.achievementWorth=worth;
    }
    public void getAchievementInfo()
    {
        System.out.println("Title: "+ titleOfAchievement);
        System.out.println("Date:"+achievementDate);
        System.out.println("Type: "+achievementType);
    }
}
