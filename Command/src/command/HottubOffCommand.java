package command;

import control.Hottub;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}

	public void undo(){
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
