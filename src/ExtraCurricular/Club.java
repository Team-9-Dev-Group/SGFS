package ExtraCurricular;

import java.util.LinkedList;

public class Club{
    private String nameOfClub;
    private String nameOfSecretary;
    private String nameOfJointSecretary;
    private LinkedList<String> events;

    public void setEvent(String event) {this.events.add(event);}

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

    //method to print events
    public void printClubEvents() {
        for (int i=0;i<events.size();i++) {
            System.out.println(this.nameOfClub);
            System.out.println(events.get(i));
        }
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

