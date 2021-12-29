import java.util.Scanner;

public class Main {
    public static Student AddStudent(){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a Name - ");
        String name = obj.nextLine();

        System.out.print("Enter StudentID - ");
        String studentid = obj.nextLine();

        System.out.print("Are you a UG student? - ");
        String tempIsUG = obj.nextLine();
        if(tempIsUG.equalsIgnoreCase("yes")){

        }

        System.out.print("Enter a Name - ");
        String name = obj.nextLine();
        Student student1 = new Student();
    }
    public static void main(String[] args) {
    }
}
