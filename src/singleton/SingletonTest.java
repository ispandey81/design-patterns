package singleton;

public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("****Classic approach****");
        Database database;
        database = Database.getInstance();
        Database database1;
        database1 = Database.getInstance();
        System.out.println("----Second approach----");
        // access the only instance this way
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE.getInstance();
        System.out.println(enumSingleton.getInfo());
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton1.setInfo("Info changed");
        // changing the info changes info on all objects as its a singleton
        System.out.println(enumSingleton.getInfo());
        System.out.println(enumSingleton1.getInfo());
    }
}
