// This interface defines a drawable object with two methods: draw and drawBorder
interface Drawable {
  
  // Default method to draw a border (provides a default implementation)
  default void drawBorder() {
    System.out.println("Drawing a border");
  }

  // Abstract method to draw the object (must be implemented by implementing classes)
  void draw();
}

// Class Circle implements the Drawable interface
class Circle implements Drawable {
  
  // Implementing the draw method from the Drawable interface
  @Override
  public void draw() {
    System.out.println("Drawing a circle");
  }

  // Optionally, override the default drawBorder method
  @Override
  public void drawBorder() {
    System.out.println("Drawing a fancy circle border");
  }
}

