package decorator;

public class OfficerImpl implements Officer{
    @Override
    public void decorate() {
        System.out.print("Undecorated officer");
    }
}
