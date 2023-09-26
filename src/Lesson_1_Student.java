public class Lesson_1_Student extends Lesson_1_Person {
    private int grade;
    private int startYear;

    public Lesson_1_Student(String name) {
        super(name);
        //this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }
}
