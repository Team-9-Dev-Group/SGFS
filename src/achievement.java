import java.util.Date;

public class achievement{
    String titleOfAchievement;
    Date achievementDate;
    String achievementType; //academic or non academic
    String achievementWorth; //gold silver bronze

    public achievement(String name)
    {
        titleOfAchievement =name;
    }
    public achievement(String name,Date date)
    {
        this(name);
        this.achievementDate=date;
    }
    public achievement(String name,Date date,String type)
    {
        this(name,date);
        this.achievementType=type;
    }
    public void setAchievementInfo(Date date, String type,String worth )
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
        System.out.println("Position: "+achievementWorth);
    }
}
