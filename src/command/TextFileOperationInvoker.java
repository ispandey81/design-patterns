package command;

import java.util.ArrayList;
import java.util.List;

//Invoker - invoking commands on the Receiver
public class TextFileOperationInvoker {

    private final List<TextFileCommand> textFileCommands = new ArrayList<>();

    public String executeOperation(TextFileCommand textFileCommand) {
        textFileCommands.add(textFileCommand);
        return textFileCommand.execute();
    }
}
