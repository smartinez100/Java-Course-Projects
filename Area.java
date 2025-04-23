public class Area {
    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getArea(double length, double width) {
        return length * width;
    }

    public static double getArea(double base1, double base2, double height) {
        return ((base1 + base2) * height) / 2;
    }

    public static void main(String[] args) {

        System.out.println("Area of Circle: " + getArea(3));
        System.out.println("Area of Rectangle: " + getArea(2, 4));
        System.out.println("Area of Trapezoid: " + getArea(3, 4, 5));
    }
}
