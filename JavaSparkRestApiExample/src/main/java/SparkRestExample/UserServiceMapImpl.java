package SparkRestExample;

import java.util.Collection;
import java.util.HashMap;

public class UserServiceMapImpl implements UserServiceInterface {
    private HashMap<String, User> userMap;

    public UserServiceMapImpl() {
        userMap = new HashMap<>();
    }

    @Override
    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public Collection<User> getUsers() {
        return userMap.values();
    }

    @Override
    public User getUser(String id) {
        return userMap.get(id);
    }

    @Override
    public User editUser(User forEditUser) throws UserException {
        try {

            if (forEditUser.getId() == null) {
                throw new UserException("ID cannot be blank");
            }
            User toEdit = userMap.get(forEditUser.getId());
            if (toEdit == null) {
                throw new UserException("SparkRestExample.User not found");
            }
            if (forEditUser.getEmail() != null) {
                toEdit.setEmail(forEditUser.getEmail());
            }
            if (forEditUser.getFirstName() != null) {
                toEdit.setFirstName(forEditUser.getFirstName());
            }
            if (forEditUser.getLastName() != null) {
                toEdit.setLastName(forEditUser.getLastName());
            }
            if (forEditUser.getId() != null) {
                toEdit.setId(forEditUser.getId());
            }
            return toEdit;
        }
        catch (Exception ex) {
            throw new UserException(ex.getMessage());
        }
    }

    @Override
    public void deleteUser(String id) {
        userMap.remove(id);
    }

    @Override
    public boolean userExist(String id) {
        return userMap.containsKey(id);
    }
}
