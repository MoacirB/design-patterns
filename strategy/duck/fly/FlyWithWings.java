package strategy.duck.fly;

/**
 *
 * @author Moacir
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
    
}
