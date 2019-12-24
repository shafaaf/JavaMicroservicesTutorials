import java.sql.*;

public class Application {

    //Create a method to connect to database
    static void createConnection(){
        try{
            //Connect to Database
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/GroceryList","root","root");

            //Create a sql statement
            Statement query = connect.createStatement();

            //Insert/Uodate data to Database
            query.executeUpdate("INSERT INTO list" + "(name)" + "VALUES('orange'), ('melons')," +
                    "('hotdogs'), ('buns')");

            //Execute a select all statement
            ResultSet rs = query.executeQuery("SELECT * FROM list");
            System.out.println("Grocery List");
            while (rs.next()){
                String table = rs.getString("name");
                System.out.println(table);
            }

//            System.out.println("Connected to Database");
        }

        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        createConnection();
    }
}
