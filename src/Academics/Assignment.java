package Academics;

public class Assignment {

    String Semester;
    String courseName;
    String CourseInstructor;
    int Points;
    float obtainedPoints;
    boolean OriginalityCheck;

    Assignment(String Semester, int Points, float obtainedPoints, boolean OriginalityCheck,
            String courseName, String CourseInstructor) {
        this.Semester = Semester;
        this.Points = Points;
        this.obtainedPoints = obtainedPoints;
        this.OriginalityCheck = OriginalityCheck;
        this.courseName = courseName;
        this.CourseInstructor = CourseInstructor;
    }

    // Getters and Setters

    // Academics.Semester
    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getSemester() {
        return Semester;
    }

    // CourseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Academics.Course Instructor
    public void setCourseInstructor(String CourseInstructor) {
        this.CourseInstructor = CourseInstructor;
    }

    public String getCourseInstructor() {
        return CourseInstructor;
    }

    // Maximum Points
    public void setPoints(int Points) {
        this.Points = Points;
    }

    public int getPoints() {
        return Points;
    }

    // obtained points
    public void setObtainedPoints(float obtainedPoints) {
        this.obtainedPoints = obtainedPoints;
    }

    public float getObtainedMarks() {
        return obtainedPoints;
    }

    // originality check passed/not
    public void setOriginalityCheck(boolean OriginalityCheck) {
        this.OriginalityCheck = OriginalityCheck;
    }

    public boolean isOriginalityCheck() {
        return OriginalityCheck;
    }

}