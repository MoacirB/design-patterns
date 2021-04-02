package caffeineBeverage;

public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        //O esqueleto do algoritmo, como ele deve funcionar, subclasses não devem alterá-la
        boilWater();
        brew();
        pourInCup();
        if( customerWantsCondiments() )addCondiments();
    }

    //Métodos definidos pelas subclasses
    abstract void brew();
    abstract void addCondiments();

    //Métodos padrão para as subclasses
    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    //Hooks, classes podem alterá-las, mas é opcional
    boolean customerWantsCondiments(){
        //Também pode ser vazia, apenas um gancho caso as subclasses precisem
        return true;
    }
}
