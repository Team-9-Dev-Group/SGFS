package Academics;

public class Exam {

    String examType;
    String examDate;
    String maxMarks;
    String contribution;
    String obtainedMarks="";
    boolean proctored=false;
    String courseName;

    // Course Class Object Parameter will be added when all the codes is merged , expect it will give error
    Exam(String examType, String maxMarks, String contribution, String obtainedMarks, String courseName, String date) {
        this.examType = examType;
        this.maxMarks = maxMarks;
        this.contribution = contribution;
        this.obtainedMarks = obtainedMarks;
        this.courseName = courseName;
        this.examDate = date;
    }
    Exam(String examType, String maxMarks, String contribution, String courseName, String date) {
        this.examType = examType;
        this.maxMarks = maxMarks;
        this.contribution = contribution;
        this.courseName = courseName;
        this.examDate = date;
    }
    Exam(String course, String date) {
        this.courseName = course;
        this.examDate = date;
    }


    //Getters and Setters
    public void setExamType(String examType) {
        this.examType = examType;
    }


    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public String getExamType() {
        return examType;
    }

    public void setMaxMarks(String maxMarks) {
        this.maxMarks = maxMarks;
    }

    public String getMaxMarks() {
        return maxMarks;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }

    public String getContribution() {
        return contribution;
    }

    public void setObtainedMarks(String obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public String getObtainedMarks() {
        return obtainedMarks;
    }

    public void setProctored(boolean proctored) {
        this.proctored = proctored;
    }

    public boolean isProctored() {
        return proctored;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
