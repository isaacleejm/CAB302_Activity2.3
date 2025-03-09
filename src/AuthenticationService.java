import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;






    // TODO Now: Add a constructor to initialize the users list with the default user

    public AuthenticationService() {
        users = new ArrayList<User>();
        users.add(new User("default", "default"));
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    @Override
    public User signUp(String username, String password) {
        for (int i = 0; i < users.size(); i++) {
            if(username.equals(users.get(i).getUsername())) {
                return null;
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    @Override
    public User logIn(String username, String password) {
        for (int i = 0; i < users.size(); i++) {
            if(username.equals(users.get(i).getUsername()) && password.equals(users.get(i).getPassword())) {
                return users.get(i);
            }
        }
        return null;
    }
}