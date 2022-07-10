package L05_Polymorphism.exercise.P04Word;

import L05_Polymorphism.exercise.P04Word.Command.CommandInit;
import L05_Polymorphism.exercise.P04Word.Command.CommandInterface;

public class Initialization {
    public static CommandInterface buildCommandInterface(StringBuilder text) {
        CommandInterface commandInterface = new CommandInit(text);
        commandInterface.init();
        return commandInterface;
    }
}
