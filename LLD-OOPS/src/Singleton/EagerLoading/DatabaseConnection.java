package Singleton.EagerLoading;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection=new DatabaseConnection();

    private DatabaseConnection(){

    }

    public static DatabaseConnection createInstance(){
        return databaseConnection;
    }
}
