package simplefactory;

public class SimpleFactoryTest {
    public static void main(String args[]) {
        CarFactory carFactory = new CarFactory();
        //If the factory method to generate the concrete type is static the line below can be written as
        //CarFactory.getBrand("VW") instead of instantiating the factory class above
        Car carVW = carFactory.getBrand("VW");
        carVW.brand();
        //If the factory method to generate the concrete type is static the line below can be written as
        //CarFactory.getBrand("VW") instead of instantiating the factory class above
        Car carKIA = carFactory.getBrand("KIA");
        carKIA.brand();
    }
}
