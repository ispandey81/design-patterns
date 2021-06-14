package decorator;

public class OfficerStarDecorator implements Officer{

    private Officer officer;

    public OfficerStarDecorator(Officer officer) {
        this.officer = officer;
    }

    //Decorating the object with some additional behavior
    @Override
    public void decorate() {
        officer.decorate();
        System.out.print(", decorated with a star");
    }
}
