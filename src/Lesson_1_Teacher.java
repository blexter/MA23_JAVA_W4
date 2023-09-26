public class Lesson_1_Teacher extends Lesson_1_Person {
    private double salary;

    public Lesson_1_Teacher(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
