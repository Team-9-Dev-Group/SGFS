package ExtraCurricular;

public interface ClubInterface {
    public void setEvent(String event);
    public void setNameOfClub(String nameOfClub);
    public void setNameOfSecretary(String nameOfSecretary);
    public void setNameOfJointSecretary(String nameOfViceSecretary);
    public String getNameOfClub();
    public String getNameOfSecretary();
    public String getNameOfViceSecretary();
    public void printClubEvents();
    public void removeEvent(String event);
}
