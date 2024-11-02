package L03.ObjectPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestDBConnectionPool {

    public static void main(String[] args){
        DBConnectionPool pool = DBConnectionPool.getInstance();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 10; i++){
            final int clientId = i;
            executor.submit(() -> {
               try {
                   DBConnection connection = pool.acquireConnection(clientId);
                   Thread.sleep(1000);
                   pool.releaseConnection(connection, clientId);
               } catch (InterruptedException e) {
                   Thread.currentThread().interrupt();
               }
            });
        }

        executor.shutdown();
    }

}
