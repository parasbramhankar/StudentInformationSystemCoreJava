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
}
