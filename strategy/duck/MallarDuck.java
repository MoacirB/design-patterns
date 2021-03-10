package strategy.duck;

import strategy.duck.fly.*;
import strategy.duck.quack.*;

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
