public class Lesson_1 {
    public static void main(String[] args) {

        Lesson_1_Course c = new Lesson_1_Course("java");

        Lesson_1_Teacher david = new Lesson_1_Teacher("David", 1000.0);
        c.setTeacher(david);

        Lesson_1_Teacher t = c.getTeacher();

        if(t != null) {
            String name = t.getName();
            double salary = t.getSalary();
            System.out.println(name + " tjänar " + salary + "kr");
        }

    }
}