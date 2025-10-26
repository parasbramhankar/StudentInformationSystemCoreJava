import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        AdminService adminService=new AdminService();
        StudentServices studentServices=new StudentServices();
        List<Student> studentList=new ArrayList<>();

        while(true){
            System.out.println("1: Admin");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.println("Select your role: ");

            int choice= scanner.nextInt();

            switch (choice){
                case1->{
                    do {
                        System.out.println("1. Adding student");
                        System.out.println("2. View all Student");
                        System.out.println("3. Update student info");
                        System.out.println("4. Enter marks");
                        System.out.println("5. Delete Student");
                        System.out.println("6. Back");
                        System.out.println("Enter choice");
                        int ch= scanner.nextInt();
                        scanner.nextLine();

                        switch (ch){
                            case 1:
                                studentList=adminService.createStudent();

                        }
                    }while()
                }
            }

        }





    }
}