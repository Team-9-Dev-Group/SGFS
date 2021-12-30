package ExtraCurricular;

import java.util.LinkedList;
// Inheritance
public class Club extends Committee{
    private String nameOfClub;
    private String nameOfSecretary;
    private String nameOfJointSecretary;
    private String nameOfCommittee;
    private String nameOfViceSecretary;
    private String getNameOfJointSecretary;

    private LinkedList<String> events;



    public void setNameOfClub(String nameOfClub) {
        this.nameOfClub = nameOfClub;
    }

    public void setNameOfCommittee(String nameOfCommittee) {
        this.nameOfCommittee = nameOfCommittee;
    }

    public void setNameOfSecretary(String nameOfSecretary) {
        this.nameOfSecretary = nameOfSecretary;
    }

    public void setNameOfViceSecretary(String nameOfViceSecretary) {
        this.nameOfViceSecretary = nameOfViceSecretary;
    }

    public String getNameOfClub() {
        return nameOfClub;
    }
    public String getNameOfCommittee() {
        return nameOfCommittee;
    }
    public String getNameOfSecretary() {
        return nameOfSecretary;
    }
    public String getNameOfViceSecretary() {
        return nameOfViceSecretary;
    }

    //method to remove a particular event from the club
    public void removeEvent(String event) {
        for (int i=0;i<events.size();i++) {
            if (events.get(i).equalsIgnoreCase(event)) {
                events.remove(i);
                return;
            }
        }
        System.out.println("No such event found!");
    }
}

