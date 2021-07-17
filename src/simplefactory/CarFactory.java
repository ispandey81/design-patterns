package simplefactory;

public class CarFactory {
    // This method can also be made static like
    // public static Car getBrand(String brandName)
    public Car getBrand(String brandName) {
        switch (brandName.toUpperCase()) {
            case "VW":
                return new Volkswagen();
            case "KIA":
                return new Kia();
            default:
                return null;
        }

    }
}
