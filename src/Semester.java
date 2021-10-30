import java.util.ArrayList;
import java.util.LinkedList;

public class Semester {

    int year;
    String semester;
    String department;

    ArrayList<String> coursesTaken = new ArrayList<>();
    ArrayList<Achievements> achievementsArrayList = new ArrayList<Achievements>();
    LinkedList<Exam> examLinkedList = new LinkedList<Exam>();


    //Getters and setters
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSemester() {
        return semester;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    //Adding objects to achievementsArrayList
    public void addAchievement() {
        Achievements achievement = new Achievements();
        //TODO: add something according to Achievements class
        achievementsArrayList.add(achievement);
    }

    public void listExams() {
        // Right now it will just print out the examLinkedList
        for (Exam exam : examLinkedList) {
            System.out.println("Course - " + exam.getCourse());
            System.out.println("Exam type - " + exam.getExamType());
            System.out.println("Date - " + exam.getDate());
            System.out.println("Maximum Marks - " + exam.getMaxMarks());
            System.out.println("Weightage in final score (%)  - " + exam.getWeightage());
            System.out.println("Obtained Marks - " + exam.getObtMarks());
            System.out.println("Proctored - " + exam.getProctored());
            System.out.println("\n");
        }
    }

    public Boolean modifyExam(String course, String exam_type, String date, String max_marks, String weightage, String obt_marks, Boolean proctored) {
        for (int i = 0; i < examLinkedList.size(); i++) {
            if (examLinkedList.get(i).getCourse().equals(course) && examLinkedList.get(i).getExamType().equals(exam_type) && examLinkedList.get(i).getDate().equals(date)) {
                examLinkedList.set(i, new Exam(course, exam_type, date, max_marks, weightage, obt_marks, proctored));
                return true; // exam found and modified
            }
        }
        return false; // exam not found
    }

}
