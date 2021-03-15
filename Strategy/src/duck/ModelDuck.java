package duck;

import duck.fly.FlyNoWay;
import duck.quack.Quack;

/**
 *
 * @author Moacir
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display(){
        System.out.println("I'm a model duck");
    }
}
