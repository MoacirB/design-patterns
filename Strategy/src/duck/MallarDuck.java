package duck;

import duck.fly.*;
import duck.quack.*;

/**
 *
 * @author Moacir
 */
public class MallarDuck extends Duck{
    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    @Override
    public void display(){
        System.out.println("I'm real Mallar duck");
    }
}
