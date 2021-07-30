package abstractfactory;

public class StarkKingdomFactory implements KingdomFactory{
    @Override
    public Castle createCastle() {
        return new StarkCastle();
    }

    @Override
    public King createKing() {
        return new StarkKing();
    }
}
