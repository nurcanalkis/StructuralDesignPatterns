package BridgeEx2;

//concrete bridge implementer classes implementing the DrawAPI interface.

public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");

    }
}
