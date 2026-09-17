import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    BackgroundPainter zara = new BackgroundPainter();
    zara.paintBackground("white", 64);
    
    FlowerPainter rita = new FlowerPainter();
    rita.setPaint(300);
    rita.paintMiddle("yellow");
    rita.paintPetals("pink");
    
    StemPainter sophia = new StemPainter();
    sophia.setPaint(300);
    sophia.moveToCenter();
    sophia.paintStem("green");

  }
}
