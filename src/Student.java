import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

    private int studentId;
    private String username;
    private String password;
    private String name;
    private String stream;
    private List<Subject>subjects;

//    public Student(int studentId, String username, String password, String name, String stream) {
//        this.studentId = studentId;
//        this.username = username;
//        this.password = password;
//        this.name = name;
//        this.stream = stream;
//        this.subjects = new ArrayList<>();
//    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", stream='" + stream + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
