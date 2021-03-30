package adapter;

import duck.Duck;
import turkey.Turkey;

public class TurkeyAdapter implements Duck{
    //Adapta um peru para ser reconhecido como um pato
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        //Mapear ao método fly de pato, já que perus voam curtas distâncias
        for(int I = 0; I<5; I++)turkey.fly();
    }

    
}
