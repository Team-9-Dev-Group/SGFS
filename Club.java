abstract public class Club {
    String committee;
    final String[] listOfCommittees = {"Design Club","Coding club","Literature Club","Sports Club","Photography Club","Music club","Finance club","Drama Club","EBSB club","Gaming Club"};
    
    Club (String committee) {
       this.committee = committee;
    }
    public void setCommittee (String committee) {
        this.committee = committee;
    }
    public String getCommittee() {
     return this.committee;
    }
}

