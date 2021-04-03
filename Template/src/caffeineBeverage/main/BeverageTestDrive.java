package caffeineBeverage.main;

import caffeineBeverage.*;

public class BeverageTestDrive {
    public static void main(String[] args) throws Exception {
        Coffee coffee  = new Coffee();
        TeaWithHook teaHook = new TeaWithHook();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
        
        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

    }
}
