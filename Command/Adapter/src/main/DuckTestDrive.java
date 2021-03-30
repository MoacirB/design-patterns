package main;

import adapter.TurkeyAdapter;
import duck.Duck;
import duck.MallarDuck;
import turkey.WildTurkey;

public class DuckTestDrive {

    public static void main(String[] args) throws Exception {
        MallarDuck duck = new MallarDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
