public class Exercise_1_Lion extends Exercise_1_Animal {
    public Exercise_1_Lion(String name) {
        super(name);
    }

    public void roar(){
        System.out.println(getName() + ": roooar");
        super.eat("banana");
    }
}
