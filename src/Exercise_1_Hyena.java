public class Exercise_1_Hyena extends Exercise_1_Animal {
    public Exercise_1_Hyena(String name) {
        super(name);
    }

    public void laugh(){
        System.out.println(super.getName() + ": hahahaha!");
    }
}
