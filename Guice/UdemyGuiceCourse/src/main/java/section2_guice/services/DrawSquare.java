package section2_guice.services;

public class DrawSquare implements DrawShape {
    @Override
    public void draw() {
        System.out.println("Drawing Square !");
    }
}
