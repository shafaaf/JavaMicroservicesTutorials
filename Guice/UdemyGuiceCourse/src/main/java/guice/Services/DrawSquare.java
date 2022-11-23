package guice.Services;

public class DrawSquare implements DrawShape {
    @Override
    public void draw() {
        System.out.println("Drawing Square !");
    }
}
