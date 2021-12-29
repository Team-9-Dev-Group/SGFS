import ExtraCurricular.Achievement;
import ExtraCurricular.Club;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private String StudentId;
    private Boolean isUG;
    private String phone_no;
    private String Probation;
    final String[] listOfclubs = {"Design ExtraCurricular.Club","Coding ExtraCurricular.Club","Sports ExtraCurricular.Club","Photography ExtraCurricular.Club","Music club","Finance club","Drama ExtraCurricular.Club","EBSB club","Gaming ExtraCurricular.Club"};


    private ArrayList<Achievement> achievementsArrayList = new ArrayList<Achievement>();
    private ArrayList<Club> clubArrayList = new ArrayList<Club>();

    public Student(String name, String StudentId, Boolean isUG, String phone_no, String probation) {

        this.name = name;
        this.StudentId = StudentId;
        this.isUG = isUG;
        this.phone_no = phone_no;
        this.Probation = Probation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public Boolean getIsUG() {
        return isUG;
    }

    public void setIsUG(Boolean isUG) {
        this.isUG = isUG;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getProbation() {
        return Probation;
    }

    public void setProbation(String probation) {
        this.Probation = probation;
    }

    //Adding objects to achievementsArrayList
    public void addAchievement(String name) {
        Achievement achievement = new Achievement(name);
        achievementsArrayList.add(achievement);
    }

    public void addAchievement(String name, Date date) {
        Achievement achievement = new Achievement(name, date);
        achievementsArrayList.add(achievement);
    }

    public void addAchievement(String name, Date date, String type) {
        Achievement achievement = new Achievement(name, date, type);
        achievementsArrayList.add(achievement);
    }

    public void removeAchievement(String Name) {
        for (int i = 0; i < achievementsArrayList.size(); i++) {
            if (achievementsArrayList.get(i).titleOfAchievement == Name) {
                achievementsArrayList.remove(i);
                break;
            }
        }
    }

    public void removeAchievement(String Name, Date date) {
        for (int i = 0; i < achievementsArrayList.size(); i++) {
            if (achievementsArrayList.get(i).titleOfAchievement == Name && achievementsArrayList.get(i).achievementDate == date) {
                achievementsArrayList.remove(i);
                break;
            }
        }
    }

    public boolean modifyAchievement(String name, Date date, String type, String worth) {
        //searching with name and modifying other details
        for (int i = 0; i < achievementsArrayList.size(); i++) {
            if (achievementsArrayList.get(i).titleOfAchievement == name) {
                achievementsArrayList.get(i).setAchievementInfo(date, type, worth);
                return true;
            }
        }
        return false;
    }

    // Adding d to clubArrayList
    public void addClub(String nameOfTheClub){
        for (int i=0;i<listOfclubs.length;i++) {
            if (listOfclubs[i].equalsIgnoreCase(nameOfTheClub)) {
                Club club = new Club();
                club.setNameOfClub(nameOfTheClub);
                club.getNameOfSecretary();
                club.getNameOfViceSecretary();
                clubArrayList.add(club);
                return;
            }
        }
        System.out.println("ExtraCurricular.Club does not exist");
    }
    
    //method to remove a particular club from the club arraylist
    public void removeClub(String nameOfTheClub) {
        for (int i=0;i<clubArrayList.size();i++) {
            if (clubArrayList.get(i).getNameOfClub().equalsIgnoreCase(nameOfTheClub)) {
                clubArrayList.remove(i);
                return;
            }
        }
        System.out.println("ExtraCurricular.Club not enrolled!");
    }

    //method to add a particular event from a paricular club
    public void addEventInClub(String nameOfTheClub, String event){
        for (int i=0;i<clubArrayList.size();i++) {
            if (clubArrayList.get(i).getNameOfClub().equalsIgnoreCase(nameOfTheClub)) {
                clubArrayList.get(i).setEvent(event);
                return;
            }
        }
        System.out.println("ExtraCurricular.Club not enrolled!");
    }
    
    //method to remove a particular event from a paricular club
    public void removeEventInClub(String nameOfTheClub, String event){
        for (int i=0;i<clubArrayList.size();i++) {
            if (clubArrayList.get(i).getNameOfClub().equalsIgnoreCase(nameOfTheClub)) {
               clubArrayList.get(i).removeEvent(event);
                return;
            }
        }
        System.out.println("ExtraCurricular.Club not enrolled!");
    }
    
    // getter for clubArrayList
    public ArrayList<Club> getClubArrayList() {
        return clubArrayList;
    }

    // to check if student has joined a specific club or not
    public boolean joinedClub(Club checkClub){
        if (clubArrayList.contains(checkClub))
            return true;
        else
            return false;
    }
}
