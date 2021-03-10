package strategy.main;

import strategy.duck.ModelDuck;
import strategy.duck.MallarDuck;
import strategy.duck.fly.FlyRocketPowered;
import strategy.duck.Duck;


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
