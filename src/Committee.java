public class Committee extends GymKhana {
    // noOfclubs, President , vPrecident, Name,feastname
    int noOfclubs;
    String committeeName;
    String presidentName;
    String vicePresidentName;
    int noOfFeast;

    public int setNoOfclubs() {
        return noOfclubs;
    }

    public void setCommitteeName(String committeeName) {
        this.committeeName = committeeName;
    }

    public void setPresidentName(String presidentName) {
        this.presidentName = presidentName;
    }

    public void setVicePresidentName(String vicePresidentName) {
        this.vicePresidentName = vicePresidentName;
    }
    public void setNoOfFeast(int noOfFeast) {
        this.noOfFeast = noOfFeast;
    }
    public String getCommitteeName() {
        return committeeName;
    }
    public int getNoOfclubs() {
        return noOfclubs;
    }
    public int getNoOfFeast() {
        return noOfFeast;
    }
    public String getPresidentName() {
        return presidentName;
    }
    public String getVicePresidentName() {
        return vicePresidentName;
    }
}
