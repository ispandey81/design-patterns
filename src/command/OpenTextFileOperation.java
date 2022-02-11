package command;

// Concrete command objects implementing the command interface
public class OpenTextFileOperation implements TextFileCommand {

    private final TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
