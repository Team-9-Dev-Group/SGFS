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

        int i = obj.nextInt();

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
            String clubName = obj.nextLine();
            student.addClub(clubName);
        }
        if (i == 6) {
            String clubName = obj.nextLine();
            student.removeClub(clubName);
        }
        if (i == 7) {
            String clubName = obj.nextLine();
            String event = obj.nextLine();
            student.addEventInClub(clubName, event);
        }
        if (i == 8) {
            String clubName = obj.nextLine();
            String event = obj.nextLine();
            student.removeEventInClub(clubName, event);
        }
        if (i == 9) {
            System.out.println("Clubs you are enrolled in are as follows-");
            student.printClubArrayList();
        }
        if(i==10){
            System.out.println("Enter the year:");
            int year = obj.nextInt();
            System.out.println("Enter the semester:");
            String sem = obj.next();
            Semester currentStu = new Semester();
            currentStu.setYear(year);
            currentStu.setSemester(sem);
            student.setSem(currentStu);


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
