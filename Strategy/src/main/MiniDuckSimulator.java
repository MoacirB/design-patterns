package main;

import duck.ModelDuck;
import duck.MallarDuck;
import duck.fly.FlyRocketPowered;
import duck.Duck;


/**
 *
 * @author Moacir
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
