import java.util.ArrayList;

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

