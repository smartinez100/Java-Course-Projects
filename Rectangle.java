
public class Rectangle {
   private int width = 0;
   private int length = 0;

   // Constructor with parameters
   public Rectangle(int width_, int length_) {
      width = width_;
      length = length_;
   }

   // Default constructor
   public Rectangle() {
      width = 0;
      length = 0;
   }

   public static int GetArea(Rectangle rectangle) {
      return (rectangle.width * rectangle.length);
   }

   // Setters
   public void SetWidth(int width_) {
      width = width_;
   }

   public void SetLength(int length_) {
      length = length_;
   }

   // Getters
   public int GetWidth() {
      return width;
   }

   public int GetLength() {
      return length;
   }

}
