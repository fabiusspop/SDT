package L03.ObjectPool;

public class DBConnection {

    private static int counter = 0;
    private int id;

    public DBConnection(){
        this.id = ++counter;
    }

    public int getId(){
        return id;
    }

    public void acquire(int clientId){
        System.out.println("Connection * " + id + " * acquired by client: " + clientId);
    }

    public void release(int clientId){
        System.out.println("Connection * " + id + " * released by client: " + clientId);
    }

}
