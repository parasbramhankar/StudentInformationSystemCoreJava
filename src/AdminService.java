import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminService {
    List<Student>students=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    public List<Student>createStudent(){
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




    }
}
