package decorator;

public class OfficerDecoratorTest {

    public static void main(String[] ar) {
        Officer officer = new OfficerImpl();
        Officer decoratedOfficer = new OfficerStarDecorator(officer);
        //First decoration
        decoratedOfficer.decorate();
        System.out.println();
        //Second decoration
        Officer medalDecorated = new OfficerMedalDecorator(decoratedOfficer);
        medalDecorated.decorate();
    }
}
