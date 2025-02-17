package Activity2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.printf("Radius: %.2f\n", circle.getRadius());
        System.out.printf("Area: %.2f\n", circle.area());
        System.out.printf("Circumference: %.2f\n", circle.circumference());
    }
}