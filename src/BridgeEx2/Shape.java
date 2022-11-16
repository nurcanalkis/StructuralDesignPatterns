package BridgeEx2;
//an abstract class Shape using the DrawAPI interface.
public abstract class Shape {
    public DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();

}
