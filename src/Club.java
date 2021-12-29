import java.util.LinkedList;

public class Club{
    private String nameOfClub;
    private String nameOfSecretary;
    private String nameOfJointSecretary;
    private LinkedList<String> events;

    public void setNameOfClub(String nameOfClub) {
        this.nameOfClub = nameOfClub;
    }

    public void setNameOfSecretary(String nameOfSecretary) {
        this.nameOfSecretary = nameOfSecretary;
    }

    public void setNameOfJointSecretary(String nameOfViceSecretary) {
        this.nameOfJointSecretary = nameOfViceSecretary;
    }

    public String getNameOfClub() {
        return nameOfClub;
    }
    public String getNameOfSecretary() {
        return nameOfSecretary;
    }
    public String getNameOfViceSecretary() {
        return nameOfJointSecretary;
    }
}

