public class Exam {

    String examType;
    int maxMarks;
    float contribution;
    float obtainedMarks;
    boolean proctored;

    // Course Parameter will be added when all the codes is merged , expect it it will give error 

    Exam(String examType, int maxMarks ,float contribution ,float obtainedMarks ,boolean proctored){
        this.examType = examType;
        this.maxMarks = maxMarks;
        this.contribution = contribution;
        this.obtainedMarks = obtainedMarks;
        this.proctored = proctored;
    }


    //Getters and Setters
    public void setExamType(String examType){
        this.examType = examType;
    }

    public String getExamType() {
        return examType;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setContribution(float contribution) {
        this.contribution = contribution;
    }

    public float getContribution() {
        return contribution;
    }

    public void setObtainedMarks(float obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public float getObtainedMarks() {
        return obtainedMarks;
    }

    public void setProctored(boolean proctored) {
        this.proctored = proctored;
    }

    public boolean isProctored() {
        return proctored;
    }
}