package abstractfactory;

public class TargaryenKingdomFactory implements KingdomFactory{
    @Override
    public Castle createCastle() {
        return new TargaryenCastle();
    }

    @Override
    public King createKing() {
        return new TargaryenKing();
    }
}
