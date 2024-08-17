package at.wald.songguesser;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * The User class represents a user of the application.
 * It contains user details such as username, password, and roles.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String role;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    /**
     * Gets the id of the user.
     *
     * @return The id of the user.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id of the user.
     *
     * @param id The id to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the username of the user.
     *
     * @return The username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user.
     *
     * @param username The username to set.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password of the user.
     *
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the user.
     *
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the roles assigned to the user.
     *
     * @return A list of roles assigned to the user.
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the role assigned to the user.
     *
     * @param role A list of roles to assign to the user.
     */
    public void setRole(String role) {
        this.role = role;
    }
}

