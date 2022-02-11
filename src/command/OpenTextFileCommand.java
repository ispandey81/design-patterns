package command;

// Concrete command objects implementing the command interface
public class OpenTextFileCommand implements TextFileCommand {

    private final TextFile textFile;

    public OpenTextFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
