package duck.quack;

/**
 *
 * @author Moacir
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
    
}
