public class MainClass {

    DatabaseDAO database;
    NetworkDAO network;

    //Setters and getters

    public boolean save(String fileName)
    {
        database.save(fileName);
        System.out.println("Saved in database in Main class");

        network.save(fileName);
        System.out.println("Saved in network in Main class");

        Testing testing = new Testing();
        testing.save(fileName);

        return true;
    }
}

class DatabaseDAO {
    public void save(String fileName) {
        System.out.println("Saved in database");
    }
}

class NetworkDAO {
    public void save(String fileName) {
        System.out.println("Saved in network location");
    }
}

class Testing {
    public void save(String fileName) {
        System.out.println("Saved in Testing location");
    }
}