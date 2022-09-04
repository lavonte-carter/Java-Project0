package Chapter2._5_Challenges.HardcodedLogin;

public class HardcodedLogin {
    /*
    this is a hardcoded login example:
    Let's say we have two users, named "admin" and "user".
    "admin" has a password of "qwerty".
    "user" has a password of "password".
    Make this method return true if there is a successful login, and false otherwise.
     */
    public boolean login(String username, String password) {

        if (username.equals("admin") && password.equals("qwerty")) {
            return true;

        } else if (username.equals("user") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }
}

