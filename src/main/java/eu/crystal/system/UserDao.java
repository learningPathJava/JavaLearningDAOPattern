package eu.crystal.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/*
 * The UserDao class implements all the functionality required for
 * fetching, updating, and removing User objects.
 */
public class UserDao implements Dao<User> {

    /*
     * For simplicity's sake, the users List acts like an in-memory database,
     * which is populated with a couple of User objects in the constructor.
     */
    private List<User> users = new ArrayList<>();

    public UserDao() {
        users.add(new User("John", "john@domain.com"));
        users.add(new User("Susan", "susan@domain.com"));
    }

    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        user.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        user.setEmail(Objects.requireNonNull(
                params[1], "Email cannot be null"));
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}
