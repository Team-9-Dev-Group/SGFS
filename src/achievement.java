import java.util.ArrayList;

public class achievement{
    String achievementName;
    int achievementYear;
    String achievementType; //academic or non academic
    public achievement()
    {

    }
    public achievement(String name)
    {
        achievementName=name;
    }
    public achievement(String name,int year)
    {
        this(name);
        this.achievementYear=year;
    }
    public achievement(String name,int year,String type)
    {
        this(name,year);
        this.achievementType=type;
    }
}
