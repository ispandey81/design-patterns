package abstractfactory;

public class AbstractFactoryTest {
    public static void main(String ar[]) {
        KingdomFactory starkKingdomFactory = new StarkKingdomFactory();
        Castle starkCastle = starkKingdomFactory.createCastle();
        King starkKing = starkKingdomFactory.createKing();
        System.out.println(starkCastle.getDescription());
        System.out.println(starkKing.getDescription());
        KingdomFactory targaryenKingdomFactory = new TargaryenKingdomFactory();
        Castle targaryenCastle = targaryenKingdomFactory.createCastle();
        King targaryenKing = targaryenKingdomFactory.createKing();
        System.out.println(targaryenCastle.getDescription());
        System.out.println(targaryenKing.getDescription());
    }
}
