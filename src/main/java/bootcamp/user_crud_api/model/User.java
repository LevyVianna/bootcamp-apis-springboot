package bootcamp.user_crud_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    private String username;
    private String password;
    private String email;

    public User() {
    }

    public User(String login, String password) {
        this.username = login;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "username = " + username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
