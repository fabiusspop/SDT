package L03.Observer;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SocialNetwork {

    public static void main(String[] args) {
        User user1 = new User("John");
        User user2 = new User("Jane");
        User user3 = new User("Andrei");
        User user4 = new User("Andrea");
        User user5 = new User("Jack");

        user1.addFollower(user2);
        user1.addFollower(user3);
        user2.addFollower(user4);
        user3.addFollower(user5);

        // random stats
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Random random = new Random();

        Runnable postStatusTask = () -> {
            User[] users = {user1, user2, user3, user4, user5};
            String[] statuses = {"status1, status2", "status3", "status4", "status5", "status6"};
            for (int i = 0; i < 5; i++) {
                User user = users[random.nextInt(users.length)];
                String status = statuses[random.nextInt(statuses.length)];
                user.postStatus(status);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        for (int i = 0; i < 5; i++) {
            executor.submit(postStatusTask);
        }

        executor.shutdown();
    }
}