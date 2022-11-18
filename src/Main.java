public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Quadrate(5),
         new Triangle(2, 4, 6),
        new Circle(2),
         new Pentagon(7, 5, 4, 8, 1)
        };
        for (Shape shape:shapes) {
            System.out.println(shape.getPerimeter());
        }

    }
}