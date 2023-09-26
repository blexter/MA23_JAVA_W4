import java.util.ArrayList;

public class Lesson_1_Course {
    private String name;
    private ArrayList<Lesson_1_Student> students = new ArrayList<>();
    private Lesson_1_Teacher teacher;


    public Lesson_1_Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Lesson_1_Student student){
        this.students.add(student);
    }

    public Lesson_1_Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Lesson_1_Teacher teacher) {
        this.teacher = teacher;
    }
}
