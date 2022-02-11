package command;

// Concrete command objects implementing the command interface
public class SaveTextFileCommand implements TextFileCommand {

    private final TextFile textFile;

    public SaveTextFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
