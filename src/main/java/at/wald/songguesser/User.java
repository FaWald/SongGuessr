package at.wald.songguesser;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "role")
    private String role;

    @Column(unique = true)
    private String email;

    private String password;

    // Constructor
    public User() {
    }

    public User(String userName, String email, String password, String role) {
        this.userName = userName;
        this.role=role;
        this.email = email;
        this.password = password;
    }

}

