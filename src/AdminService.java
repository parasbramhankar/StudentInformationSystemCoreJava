import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminService {
    List<Student>students=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    public Student createStudent(){
        Student student=new Student();
        System.out.println("Enter the studentId: ");
        int id= scanner.nextInt();
        student.setStudentId(id);

        System.out.println("Enter the username for student");
        String username= scanner.next();
        student.setName(username);

        System.out.println("Enter the password");
        String pass= scanner.next();
        student.setPassword(pass);

        scanner.nextLine();

        System.out.println("Enter the name");
        String name=scanner.nextLine();
        student.setName(name);

        System.out.println("Enter stream name");
        String stream= scanner.next();
        student.setName(stream);

        System.out.println("Enter marks details");
        List<Subject>subjects=createSubject();
        student.setSubjects(subjects);

      return student;
    }

    public List<Subject> createSubject(){

        //considering there are 3 subjects
        List<Subject>subjects=new ArrayList<>();

        for(int i=0;i<3;i++) {
            Subject subject = new Subject();

            System.out.println("Enter name subject: ");
            String name = scanner.next();
            subject.setName(name);

            System.out.println("Enter marks of subject: ");
            int marks = scanner.nextInt();
            subject.setMarks(marks);

            subjects.add(subject);
        }

        return subjects;
    }

    //view all the student marks

    public void viewStudents(List<Student> students){
        for(Student s:students){
            System.out.println(s);
        }
    }

    public void updateStudentMarks(List<Student>students){

        System.out.println("Enter studentId: ");
        int id=scanner.nextInt();
        boolean check=false;

        for(Student student:students){

            if(student.getStudentId()==id){
                System.out.println("Enter subject name");
                String name= scanner.next();

                check=true;

                List<Subject>subjects=student.getSubjects();

                for(Subject s:subjects){
                    if(s.getName().equals(name)){
                        System.out.println("Subject found");
                        System.out.println("Enter subject marks: ");
                        int mark= scanner.nextInt();
                        s.setMarks(mark);
                    }

                }

            }
        }

        if(!check){
            System.out.println("Student not found");
        }
    }

    void updateUsernamePassword(List<Student>students){

        System.out.println("Enter the student Id");
        int id=scanner.nextInt();
        boolean check=false;


        for(Student s:students){
            if(s.getStudentId()==id){
                check=true;

                boolean login=false;
                System.out.println("Enter user name: ");
                String userName=scanner.next();

                if(s.getUsername().equals(userName)){
                    System.out.println("Enter password: ");
                    String pass= scanner.next();

                    if(s.getPassword().equals(pass)){
                        login=true;
                    }
                }

                System.out.println("1. Change username");
                System.out.println("2. Change password");
                int n=scanner.nextInt();

                switch (n){

                    case 1:
                       if(login){
                        System.out.println("Enter new username");
                        String user=scanner.next();
                        s.setUsername(user);
                        }else{
                        System.out.println("Invalid username & Password");
                        }
                        break;
                    case 2:
                          if(login){
                            System.out.println("Enter new password");
                            String pass=scanner.next();
                            s.setPassword(pass);
                        }else{
                            System.out.println("Invalid username & password");
                        }
                        break;
                    default:
                        System.out.println("Invalid input...!!");
                        break;
                }
            }
        }
    }


    //delete student
    void deleteStudent(List<Student>studentList){
        System.out.println("Enter the studentId");
        int id= scanner.nextInt();

        for(Student student:studentList){
            if(student.getStudentId()==id){
               studentList.remove(student);
            }
        }
    }

}
