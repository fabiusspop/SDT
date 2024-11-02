package L03.Observer;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> followers;

    public User(String name) {
        this.name = name;
        this.followers = new ArrayList<>();
    }

    public void addFollower(User follower) {
        followers.add(follower);
    }

    public void postStatus(String status) {
        System.out.println(name + " --- status: '" + status + "'");
        notifyFollowers(status);
    }

    private void notifyFollowers(String status) {
        for (User follower : followers) {
            System.out.println(follower.getName() + " notified:  " + name + " posted status: '" + status + "'");
        }
    }

    public String getName() {
        return name;
    }
}