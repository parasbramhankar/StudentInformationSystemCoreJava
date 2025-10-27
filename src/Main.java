import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        while(true){
            Scanner scanner=new Scanner(System.in);
            AdminService adminService=new AdminService();
            StudentServices studentServices=new StudentServices();
            List<Student> studentList=new ArrayList<>();
            Student student=new Student();

            System.out.println("1: Admin");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.println("Select your role: ");

            int choice= scanner.nextInt();
            char c;
            switch (choice) {
                case 1:
                    do {
                        System.out.println("1. Adding student");
                        System.out.println("2. View all Student");
                        System.out.println("3. Update student info");
                        System.out.println("4. Update Marks: ");
                        System.out.println("5. Delete Student");
                        System.out.println("Enter choice");
                        int ch = scanner.nextInt();
                        scanner.nextLine();

                        switch (ch) {
                            case 1:
                                student = adminService.createStudent();
                                studentList.add(student);
                                break;

                            case 2:
                                adminService.viewStudents(studentList);
                                break;
                            case 3:
                                adminService.updateUsernamePassword(studentList);
                                break;

                            case 4: //update student marks
                                adminService.updateStudentMarks(studentList);
                                break;
                            case 5: //delete student
                                adminService.deleteStudent(studentList);

                        }

                        System.out.println("Do you what to continue the operations ?: ");
                        while (true) {
                            System.out.println("Enter Y/N");
                            c = scanner.next().charAt(0);
                            if (c == 'Y' || c == 'y' || c == 'n' || c == 'N') {
                                break;
                            } else {
                                System.out.println("Enter valid input (y/n)");
                            }

                        }


                    } while (c == 'Y' || c == 'y');
                    break;
                case 2:



            }

            }

        }

    }
}