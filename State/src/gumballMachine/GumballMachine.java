package gumballMachine;

import states.HasQuarterState;
import states.NoQuarterState;
import states.SoldOutState;
import states.SoldState;
import states.State;
import states.WinnerState;

public class GumballMachine {
    State soldState;
    State hasQuarterState;
    State noQuarterState;
    State soldOutState;
    State winnerState;

    State state;
    int count;

    public GumballMachine(int numberGumballs){
        count = numberGumballs;
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        if(count>0)state = noQuarterState;
        else state = soldOutState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count !=0)count--;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCount(){
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
