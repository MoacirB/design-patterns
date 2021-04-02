package caffeineBeverage;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
       System.out.println("Dripping Coffe through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    
}
