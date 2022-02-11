package command;

// Client class issuing commands
public class CommandPatternClient {

    public static void main(String[] args) {

        TextFileCommand openTextFileCommand = new OpenTextFileCommand(new TextFile("file1.txt"));
        TextFileCommand saveTextFileCommand = new SaveTextFileCommand(new TextFile("file2.txt"));
        TextFileOperationInvoker textFileOperationInvoker = new TextFileOperationInvoker();
        System.out.println(textFileOperationInvoker.executeOperation(openTextFileCommand));
        System.out.println(textFileOperationInvoker.executeOperation(saveTextFileCommand));
    }
}