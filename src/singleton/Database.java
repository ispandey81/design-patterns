package singleton;

class Database {
    // private field
    private static Database dbObject;
    // private constructor
    private Database() {
    }
    // public method for accessing the singleton
    public static Database getInstance() {
        // create object if it's not already created
        if(dbObject == null) {
            System.out.println("Creating the object for the first time");
            dbObject = new Database();
            return dbObject;
        }
        // returns the singleton object
        System.out.println("Object already created, returning it");
        return dbObject;
    }
}

