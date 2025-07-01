package Patterns.Creational.Singleton;

public class Singleton {
    private static Singleton instance;
    private String connection;
    private Singleton(String connection) {
        this.connection = connection;
    }
    public static Singleton getInstance() {
        instance =  instance == null ? new Singleton("aatomatik") : instance;
        return instance;
    }

    public String toString() {
        return connection;
    }
}
