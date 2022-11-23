package section7_ways_of_injection.services;

public class DrawSquare implements DrawShape {
    @Override
    public void draw() {
        System.out.println("Drawing Square !");
    }
}
