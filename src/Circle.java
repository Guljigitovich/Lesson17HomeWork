public class Circle extends Shape{
    private  int a;

    public Circle(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 2*a*Math.PI;
    }
}
