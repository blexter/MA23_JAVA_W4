public class Exercise_1_Animal {
    private String name;

    public Exercise_1_Animal(String name) {
        this.name = name;
    }

    public void eat(String food){
        System.out.println(this.name + " eating " + food);
    }

    public String getName() {
        return name;
    }
}
