public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        // Setting initial values
        rect.SetWidth(20);
        rect.SetLength(10);

        // Printing initial rectangle values
        System.out.println("Rectangle Length = " + rect.GetLength());
        System.out.println("Rectangle Width = " + rect.GetWidth());
        System.out.println("Rectangle Area = " + Rectangle.GetArea(rect));

        // Changing rectangle values
        rect.SetWidth(40);
        rect.SetLength(30);

        // Printing new values
        System.out.println("\nRectangle Length = " + rect.GetLength());
        System.out.println("Rectangle Width = " + rect.GetWidth());
        System.out.println("Rectangle Area = " + Rectangle.GetArea(rect));

    }
}
