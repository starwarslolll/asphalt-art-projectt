public class StemPainter extends PainterPlus {

  public void moveToCenter() {
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
  }
  
  public void paintStem(String color) {

    if (canMove()) {
      move();
    }

    while (canMove()) {
      move();
      paint(color);
    }
  }
}