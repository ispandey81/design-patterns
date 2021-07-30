package simplefactory;

/**
 * SimpleFactory usually has a static method for creating objects
 * The implementation below is how a factory method is implemented.
 */
public class SimpleFactoryTest {
    public static void main(String args[]) {
        CarFactory carFactory = new CarFactory();
        //If the factory method to generate the concrete type is static the line below can be written as
        //CarFactory.getCar("VW") instead of instantiating the factory class above
        Car carVW = carFactory.getCar("VW");
        carVW.brand();
        //If the factory method to generate the concrete type is static the line below can be written as
        //CarFactory.getCar("VW") instead of instantiating the factory class above
        Car carKIA = carFactory.getCar("KIA");
        carKIA.brand();
    }
}
