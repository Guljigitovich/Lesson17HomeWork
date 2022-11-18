public class Quadrate extends Shape{
    private int a;

    public Quadrate(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return a*4;
    }

    @Override
    public String toString() {
        return "Quadrate{" +
                "a=" + a +
                '}';
    }
}
