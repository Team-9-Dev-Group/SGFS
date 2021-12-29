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

        return new Student(name, studentid, isUG, phoneNum, probation);
    }

    public static int options(){
        Scanner obj = new Scanner(System.in);

        System.out.println("Press 1 to Add Achievement");
        System.out.println("Press 1 to Add Achievement");
        System.out.println("Press 1 to Add Achievement");
        System.out.println("Press 1 to Add Achievement");
        System.out.println("Press 1 to Add Achievement");
        System.out.println("Press 1 to Add Achievement");
        System.out.println("Press 1 to Add Achievement");
        System.out.println("Press 1 to Add Achievement");

        int i = obj.nextInt();

        if(i == 1){

        }
        if (i == 2) {

        }
        if(i==3){

        }
        if(i==4){

        }

        return i;

    }


    public static void main(String[] args) {
        Student student1 = AddStudent();
    }
}
