package adapter;

import java.util.Random;

import duck.Duck;
import turkey.Turkey;

public class DuckAdapter implements Turkey{
    //Adaptar um pato para que ele seja reconhecido como um peru
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck){
        this.duck = duck;
        this.rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        //Como patos voam mais que perus, voam uma em cada 5 vezes
        if(rand.nextInt(5) == 0)duck.fly();
    }

    //Se um método não tiver um método equivalente da classe adaptada, lançar uma exceção.
    
}
