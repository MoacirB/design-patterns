package command;


public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }
    @Override
    public void execute() {
       for(int I = 0; I<commands.length; I++){
            commands[I].execute();
       }   
    }

    @Override
    public void undo() {
        for(int I = 0; I<commands.length; I++){
            commands[I].undo();
       }
    }
    
}
