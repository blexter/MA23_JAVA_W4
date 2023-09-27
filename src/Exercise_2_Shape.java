public class Exercise_2_Shape {
    private double width;
    private double height;

    public Exercise_2_Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return this.width * this.height;
    }
}
