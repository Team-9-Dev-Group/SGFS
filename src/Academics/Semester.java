package Academics;

import java.util.*;

public class Semester {

    private String year;
    private String semester;
    private String department;

    private ArrayList<Course> CoursesList = new ArrayList<Course>();
    private LinkedList<Exam> examLinkedList = new LinkedList<Exam>();
    private LinkedList<Assignment> assignmentLinkedList = new LinkedList<>();

    //Getters and setters
    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
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

    // Academics.Course List method

    static String str = "Optional Academics.Course";

    static String[] Sem_1_Courses = new String[]{"MA101", "PH100", "PH160", "IT101", "IT161", "EC100", "EC160", "HS101"};
    static String[] Sem_2_Courses = new String[]{"MA102", "PH110", "PH170", "EE100", "EE160", "CS102", "CS162", "HS102"};
    static String[] Sem_3_Courses = new String[]{"SC201", "MA201", "HS201", "CS201", "CS261", "CS203", "CS263", "EC201", "EC261"};
    static String[] Sem_4_Courses_CSE = new String[]{"MA202", "HS202", "CS202", "CS204", "CS262", "CS206", "CS266", "CS208", "CS268"};
    static String[] Sem_4_Courses_IT = new String[]{"HS202", "IT202", "IT262", "CS204", "CS262", "CS206", "CS266", "CS208", "CS268"};
    static String[] Sem_5_Courses_CSE = new String[]{"CS301", "CS361", "CS303", "CS363", "CS305", str, str, "CS391"};
    static String[] Sem_5_Courses_IT = new String[]{"CS301", "CS361", "CS303", "CS363", "IT301", "IT361", str, str, "IT391"};
    static String[] Sem_6_Courses_CSE = new String[]{"CS302", "CS362", "CS304", "CS364", str, str, str, str};
    static String[] Sem_6_Courses_IT = new String[]{"IT302", "IT362", "IT304", str, str, str, str};
    static String[] Sem_7_Courses_CSE = new String[]{"CS401", "CS461", str, str, str, str, "CS491"};
    static String[] Sem_7_Courses_IT = new String[]{"IT401", "IT461", str, str, str, str, "IT491"};
    static String[] Sem_8_Courses = new String[]{"Project"};


    //Encapsulation 
    //Use of private keyword
    private void set_CourseList(String[] courses) {
        for (int i = 0; i < courses.length; i++) {
            Course name = new Course();
            name.set_Code(courses[i]);
            CoursesList.add(name);
        }
    }

    public void create_CourseList(int year, String semester, String department) {
        int Sem_No = 0;
        switch (semester) {
            case "autumn":
                Sem_No = (year * 2) - 1;
                break;
            case "winter":
                Sem_No = year * 2;
                break;
            default:
                System.out.println("Invalid Semester.");
        }

        switch (Sem_No) {
            case 1:
                set_CourseList(Sem_1_Courses);
                break;
            case 2:
                set_CourseList(Sem_2_Courses);
                break;
            case 3:
                set_CourseList(Sem_3_Courses);
                break;
            case 4:
                if (department == "CSE")
                    set_CourseList(Sem_4_Courses_CSE);
                else if (department == "IT")
                    set_CourseList(Sem_4_Courses_IT);
                break;
            case 5:
                if (department == "CSE")
                    set_CourseList(Sem_5_Courses_CSE);
                else if (department == "IT")
                    set_CourseList(Sem_5_Courses_IT);
                break;
            case 6:
                if (department == "CSE")
                    set_CourseList(Sem_6_Courses_CSE);
                else if (department == "IT")
                    set_CourseList(Sem_6_Courses_IT);
                break;
            case 7:
                if (department == "CSE")
                    set_CourseList(Sem_7_Courses_CSE);
                else if (department == "IT")
                    set_CourseList(Sem_7_Courses_IT);
                break;
            case 8:
                set_CourseList(Sem_8_Courses);
                break;

            default:
                System.out.println("Invalid Input");

        }
    }

    // Polymorphism - Overloading
    public void addExam(String exam_type, String max_marks, String weightage, String course, String date) {
        Exam newExam = new Exam(exam_type, max_marks, weightage, course, date);
        examLinkedList.add(newExam);
    }

    public void addExam(String Course, String Date) {
        Exam newExam = new Exam(Course, Date);
        examLinkedList.add(newExam);
    }

    // Polymorphism - Overloading
    public void removeExam(String Course, String Date) {
        for (Exam i : examLinkedList) {
            if (i.examDate.equals(Date) && i.courseName.equalsIgnoreCase(Course)) {
                examLinkedList.remove(i);
            }
        }
    }

    public void removeExam(String Date) {
        for (Exam i : examLinkedList) {
            if (i.examDate.equals(Date)) {
                examLinkedList.remove(i);
            }
        }
    }

    public Boolean modifyExam(String exam_type, String max_marks, String weightage, String course, String date, String obt_marks) {
        for (int i = 0; i < examLinkedList.size(); i++) {
            if (examLinkedList.get(i).getCourseName().equals(course) && examLinkedList.get(i).getExamType().equals(exam_type) && examLinkedList.get(i).getExamDate().equals(date)) {
                examLinkedList.set(i, new Exam(exam_type, max_marks, weightage, obt_marks, course, date));
                return true; // exam found and modified
            }
        }
        return false; // exam not found
    }

    public Boolean modifyExam(String exam_type, String max_marks, String weightage, String course, String date) {
        for (int i = 0; i < examLinkedList.size(); i++) {
            if (examLinkedList.get(i).getCourseName().equals(course) && examLinkedList.get(i).getExamType().equals(exam_type) && examLinkedList.get(i).getExamDate().equals(date)) {
                examLinkedList.set(i, new Exam(exam_type, max_marks, weightage, course, date));
                return true; // exam found and modified
            }
        }
        return false; // exam not found
    }

    // Methods for Exam Class
    public void listExams() {
        Collections.sort(examLinkedList, new StockComparator());
        for (Exam exam : examLinkedList) {
            System.out.println("Course - " + exam.getCourseName());
            System.out.println("Exam type - " + exam.getExamType());
            System.out.println("Date - " + exam.getExamDate());
            System.out.println("Maximum Marks - " + exam.getMaxMarks());
            System.out.println("Weightage in final score (%)  - " + exam.getContribution());
            System.out.println("Obtained Marks - " + exam.getObtainedMarks());
            System.out.println("Proctored - " + exam.isProctored());
            System.out.println("\n");
        }
    }
}

class StockComparator implements Comparator<Exam> {
    public int compare(Exam e1, Exam e2) {
        int year1, year2, mon1, mon2, day1, day2;
        year1 = Integer.parseInt(e1.getExamDate().substring(6, 10));
        year2 = Integer.parseInt(e2.getExamDate().substring(6, 10));
        mon1 = Integer.parseInt(e1.getExamDate().substring(3, 5));
        mon2 = Integer.parseInt(e2.getExamDate().substring(3, 5));
        day1 = Integer.parseInt(e1.getExamDate().substring(0, 2));
        day2 = Integer.parseInt(e2.getExamDate().substring(0, 2));

        if(year1>year2){
            return 1;
        }
        else if(year1<year2){
            return -1;
        }
        else{
            if(mon1>mon2){
                return 1;
            }
            else if(mon1<mon2){
                return -1;
            }
            else{
                if(day1>day2){
                    return 1;
                }
                else if(day1<day2){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        }
    }
}
