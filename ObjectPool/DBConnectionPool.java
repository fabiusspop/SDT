package L03.ObjectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DBConnectionPool {

    private static final int MAX_CONNECTIONS = 5;
    private static DBConnectionPool instance;
    private BlockingQueue<DBConnection> pool;

    private DBConnectionPool() {
        pool = new LinkedBlockingQueue<>(MAX_CONNECTIONS);
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            pool.add(new DBConnection());
        }
    }

    public static synchronized DBConnectionPool getInstance() {
        if (instance == null) {
            instance = new DBConnectionPool();
        }
        return instance;
    }

    public DBConnection acquireConnection(int clientId) throws InterruptedException {
        DBConnection connection = pool.take();
        connection.acquire(clientId);
        return connection;
    }

    public void releaseConnection(DBConnection connection, int clientId) {
        connection.release(clientId);
        pool.offer(connection);
    }
}