package ud3.ejercicios;

import java.time.LocalDateTime;

public class User {
    @SuppressWarnings("unused")
    private String username, passsword, email;
    @SuppressWarnings("unused")
    private LocalDateTime createAt, lastLogin;
    @SuppressWarnings("unused")
    private boolean enabled;
    public User(String username, String passsword, String email, boolean enabled) {
        this.username = username;
        this.passsword = passsword;
        this.email = email;
        this.createAt = LocalDateTime.now();
        this.enabled = enabled;
    }
    public User(String username, String passsword) {
        this.username = username;
        this.passsword = passsword;
        this.email = null;
        this.createAt = LocalDateTime.now();
        this.enabled = true;
    }
    public User(String username) {
        this.username = username;
        this.passsword = null;
    }
    @Override
    public String toString() {
        return username;
    }
    
}
