import Academics.Semester;
import ExtraCurricular.Achievement;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Student AddStudent() {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Name - ");
        String name = obj.nextLine();

        System.out.print("Enter StudentID - ");
        String studentid = obj.nextLine();

        System.out.print("Are you a UG student? - ");
        String tempIsUG = obj.nextLine();
        boolean isUG;
        if (tempIsUG.equalsIgnoreCase("yes")) {
            isUG = true;
        } else {
            isUG = false;
        }

        System.out.print("Enter phone number - ");
        String phoneNum = obj.nextLine();

        System.out.print("Enter whether you are under probation - ");
        String probation = obj.nextLine();

        System.out.println();

        return new Student(name, studentid, isUG, phoneNum, probation);
    }

    public static int options(Student student) {
        Scanner obj = new Scanner(System.in);
        System.out.println();
        System.out.println("Press 1 to Add Achievement");
        System.out.println("Press 2 to Modify Achievement");
        System.out.println("Press 3 to Delete Achievement");
        System.out.println("Press 4 to Display Achievement");

        System.out.println("Press 5 to Add Club");
        System.out.println("Press 6 to Remove Club");
        System.out.println("Press 7 to Add Event in a Club");
        System.out.println("Press 8 to Remove Event in a Club");
        System.out.println("Press 9 to Print Clubs you are enrolled in");

        System.out.println("Press 10 to set semester");
        System.out.println("Press 11 to Add Exam");
        System.out.println("Press 12 to Remove Exam");
        System.out.println("Press 13 to Modify Exam");
        System.out.println("Press 14 to list added Exams");
        
        System.out.print("Enter your choice : ");
        int i = obj.nextInt();
        System.out.println();

        if (i == 1) {
            System.out.print("Enter Acievement name - ");
            String name = obj.nextLine();

            System.out.print("Enter Acievement date - ");
            String date = obj.nextLine();

            System.out.print("Enter Acievement type - ");
            String type = obj.nextLine();

            student.addAchievement(name, date, type);
        }
        if (i == 2) {
            System.out.print("Enter Acievement name - ");
            String name = obj.nextLine();

            student.removeAchievement(name);
        }
        if (i == 3) {
            System.out.print("Enter Acievement name - ");
            String name = obj.nextLine();

            System.out.print("Enter Acievement date - ");
            String date = obj.nextLine();

            System.out.print("Enter Acievement type - ");
            String type = obj.nextLine();

            System.out.print("Enter Acievement worth - ");
            String worth = obj.nextLine();

            student.modifyAchievement(name, date, type, worth);
        }
        if (i == 4) {
            for (final Achievement achievement : student.achievementsArrayList) {
                achievement.getAchievementInfo();
            }
        }


        if (i == 5) {
            System.out.print("Enter club name - ");
            String clubName = obj.nextLine();
            student.addClub(clubName);
        }
        if (i == 6) {
            System.out.print("Enter club name - ");
            String clubName = obj.nextLine();
            student.removeClub(clubName);
        }
        if (i == 7) {
            System.out.print("Enter club name - ");
            String clubName = obj.nextLine();
            System.out.print("Enter event description - ");
            String event = obj.nextLine();
            student.addEventInClub(clubName, event);
        }
        if (i == 8) {
            System.out.print("Enter club name - ");
            String clubName = obj.nextLine();
            System.out.print("Enter event description - ");
            String event = obj.nextLine();
            student.removeEventInClub(clubName, event);
        }
        if (i == 9) {
            System.out.println("Clubs you are enrolled in are as follows-");
            student.printClubArrayList();
        }


        if (i == 10) {
            System.out.print("Enter your year: ");
            String year = obj.next();
            System.out.print("Enter your semester: ");
            String sem = obj.next();
            System.out.print("Enter your department: ");
            String dep = obj.next();
            Semester currentStu = new Semester();
            currentStu.setYear(year);
            currentStu.setSemester(sem);
            currentStu.setDepartment(dep);
            student.setSem(currentStu);
            currentStu.create_CourseList(Integer.parseInt(year), sem, dep);
        }
        if (i == 11) {
            System.out.print("Enter course name - ");
            obj.nextLine();
            String course = obj.nextLine();
            System.out.print("Enter exam type - ");
            String exam_type = obj.nextLine();
            System.out.print("Enter date - ");
            String date = obj.nextLine();
            System.out.print("Enter maximum marks - ");
            String max_marks = obj.nextLine();
            System.out.print("Enter weightage to final grade of course - ");
            String weightage = obj.nextLine();
            student.getSem().addExam(exam_type,max_marks,weightage,course, date );
        }
        if (i == 12) {
            System.out.print("Enter course name - ");
            String course = obj.nextLine();
            System.out.print("Enter date - ");
            String date = obj.nextLine();
            student.getSem().removeExam(course, date);
        }
        if (i == 13) {
            System.out.print("Enter course name - ");
            String course = obj.nextLine();
            System.out.print("Enter exam type - ");
            String exam_type = obj.nextLine();
            System.out.print("Enter date - ");
            String date = obj.nextLine();
            System.out.print("Enter maximum marks - ");
            String max_marks = obj.nextLine();
            System.out.print("Enter weightage to final grade of course - ");
            String weightage = obj.nextLine();
            System.out.print("Enter obtained marks - ");
            String obt_amrks = obj.nextLine();
            student.getSem().modifyExam(exam_type,max_marks,weightage,course,date,obt_amrks);
        }
        if (i == 14) {
            System.out.println("Your Exams are as follows -");
            student.getSem().listExams();
        }

        return i;
    }

    public static void main(String[] args) {
        Student student1 = AddStudent();
        int i;
        do {
            i = options(student1);
        } while (i != 0);
    }
}
