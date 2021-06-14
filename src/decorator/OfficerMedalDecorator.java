package decorator;

public class OfficerMedalDecorator implements Officer {

    private Officer officer;

    public OfficerMedalDecorator(Officer officer) {
        this.officer = officer;
    }

    @Override
    public void decorate() {
        officer.decorate();
        System.out.print(", decorated with a medal");
    }
}
