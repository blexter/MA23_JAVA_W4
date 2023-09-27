public class Exercise_2_Triangle extends Exercise_2_Shape{
    public Exercise_2_Triangle(double width, double height) {
        super(width, height);
    }

    public double getArea(){
        return super.getArea() / 2;
    }
}
