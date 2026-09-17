import org.code.neighborhood.*;

public class FlowerPainter extends PainterPlus {

  public void stepForward() {
    move();
    move();
    move();
  }

  public void paintMiddle(String color) {
    resetPosition();

    stepForward();
    turnRight();
    stepForward();

    paint(color);
  }

  public void paintPetals(String color) {
    int petals = 0;

    while (petals < 4) {
      if (canMove()) {
        move();
        paint(color);

        turnRight();
        turnRight();
        move();
        turnRight();
        turnRight();
      }

      turnRight();
      petals++;
    }
  }

  
}
