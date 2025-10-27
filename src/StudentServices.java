import java.util.List;
import java.util.Scanner;

public class StudentServices {
    Scanner scanner=new Scanner(System.in);
    void checkDetails(List<Student>studentList){
        System.out.println("Enter the studentId");
        int id=scanner.nextInt();

        boolean check=false;

        for(Student student:studentList){

            if(student.getStudentId()==id){
                check=true;

                System.out.println("Enter the username: ");
                String userName=scanner.next();

                if(student.getUsername().equals(userName)){
                    System.out.println("Enter the password");
                    String pass=scanner.next();

                    if(student.getPassword().equals(pass)){
                        System.out.println("Found");

                        System.out.println("Your details: ");
                        System.out.println(student);
                    }
                    else{
                        System.out.println("Wrong password");
                    }
                }else {
                    System.out.println("Wrong username");
                }
            }
        }

        if(!check){
            System.out.println("Student not found with this id");
        }
    }

    void checkResult(List<Student>studentList){

        System.out.println("Enter the studentId");
        int id=scanner.nextInt();
        boolean check=false;

        for(Student student:studentList) {

            if (student.getStudentId() == id) {
                check = true;

                System.out.println("Enter the username: ");
                String userName = scanner.next();

                if (student.getUsername().equals(userName)) {
                    System.out.println("Enter the password");
                    String pass = scanner.next();

                    if (student.getPassword().equals(pass)) {
                        List<Subject>subjects=student.getSubjects();

                        int totalMarks=0;
                        int count=0;

                        for(Subject s:subjects){
                            totalMarks+=s.getMarks();
                            count++;
                        }
                        double avg= (double) totalMarks /count;

                        if(avg>=80){
                            System.out.println("Pass: O+ grade"+avg);
                        }else if(avg>60 && avg<79){
                            System.out.println("Pass: A+ grade"+avg);
                        }else{
                            System.out.println("Fail: "+avg);
                        }
                    }
                }
            }
        }

        if(!check){
            System.out.println("Student not found");
        }
    }
}
