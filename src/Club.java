import java.util.ArrayList;
//public class Club extends Committee {
//    String nameOfClub;
//    String nameOfCommittee;
//    String nameOfSecretary;
//    String nameOfViceSecretary;
//
//    public void setNameOfClub(String nameOfClub) {
//        this.nameOfClub = nameOfClub;
//    }
//
//    public void setNameOfCommittee(String nameOfCommittee) {
//        this.nameOfCommittee = nameOfCommittee;
//    }
//
//    public void setNameOfSecretary(String nameOfSecretary) {
//        this.nameOfSecretary = nameOfSecretary;
//    }
//
//    public void setNameOfViceSecretary(String nameOfViceSecretary) {
//        this.nameOfViceSecretary = nameOfViceSecretary;
//    }
//
//    public String getNameOfClub() {
//        return nameOfClub;
//    }
//    public String getNameOfCommittee() {
//        return nameOfCommittee;
//    }
//    public String getNameOfSecretary() {
//        return nameOfSecretary;
//    }
//    public String getNameOfViceSecretary() {
//        return nameOfViceSecretary;
//    }
//}



//public class Committee extends GymKhana {
//    // noOfclubs, President , vPrecident, Name,feastname
//    int noOfclubs;
//    String committeeName;
//    String presidentName;
//    String vicePresidentName;
//    int noOfFeast;
//
//    public int setNoOfclubs() {
//        return noOfclubs;
//    }
//
//    public void setCommitteeName(String committeeName) {
//        this.committeeName = committeeName;
//    }
//
//    public void setPresidentName(String presidentName) {
//        this.presidentName = presidentName;
//    }
//
//    public void setVicePresidentName(String vicePresidentName) {
//        this.vicePresidentName = vicePresidentName;
//    }
//    public void setNoOfFeast(int noOfFeast) {
//        this.noOfFeast = noOfFeast;
//    }
//    public String getCommitteeName() {
//        return committeeName;
//    }
//    public int getNoOfclubs() {
//        return noOfclubs;
//    }
//    public int getNoOfFeast() {
//        return noOfFeast;
//    }
//    public String getPresidentName() {
//        return presidentName;
//    }
//    public String getVicePresidentName() {
//        return vicePresidentName;
//    }
//}


// ____________________________________________________________________




abstract public class Club {

    // list for storing selected clubs
    private ArrayList<String> selectedClubs = new ArrayList<>();
    //total club options
    final String[] listOfclubs = {"Design Club","Coding club","Literature Club","Sports Club","Photography Club","Music club","Finance club","Drama Club","EBSB club","Gaming Club"};

    // print list of all clubs
    public void showClubList() {
        for(int i=0;i<listOfclubs.length;i++) {
            System.out.println(i+1+". "+listOfclubs[i]);
        }
    }

    //method for selecting clubs multiple inputs can be given at the same time
    public void setClubs(int...arr) {
        for(int i=0;i<arr.length;i++) {
            selectedClubs.add(listOfclubs[arr[i]-1]);
        }
        showSelectedClubs();
    }

    // method for removing selected clubs, multiple inputs can be given at the same time
    public void removeClubs(int...arr) {
        for(int i=0;i<arr.length;i++) {
            selectedClubs.remove(listOfclubs[arr[i]-1]);
        }
        showSelectedClubs();
    }

    // print all the selected clubs
    public void showSelectedClubs() {
        if(selectedClubs.size() == 0) {
            System.out.println("No club selected yet!");
            return;
        }
        System.out.println("Selected clubs : ");
        for(String str: selectedClubs) {
            System.out.println(str);
        }
    }
}

