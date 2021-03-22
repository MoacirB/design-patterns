package singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    //Apresenta erros! Dois segmentos executando o código ao mesmo tempo pode criar duas instâncias.
    /*public static ChocolatBoiler getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolatBoiler();
        }
        return uniqueInstance;
    }
    */

    //Resolve os problemas acima ao custo de velocidade de processamento.
    /*public static synchronized ChocolatBoiler getInstace(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolatBoiler();
        }
        return uniqueInstance;
    }*/

    //Método mais efetivo
    public static ChocolateBoiler getInstance(){
        if(uniqueInstance == null){
            synchronized (ChocolateBoiler.class){
                if(uniqueInstance == null){
                    System.out.println("Creating unique instance of Chocolate Boiler");
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }
    public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
