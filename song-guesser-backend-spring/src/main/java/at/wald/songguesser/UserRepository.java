package at.wald.songguesser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The UserRepository interface provides methods for performing CRUD operations on User entities.
 * It extends the JpaRepository interface provided by Spring Data JPA.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Finds a user by their username.
     *
     * @param username The username of the user to find.
     * @return An Optional containing the found user, or empty if no user was found.
     */
    User findByUsername(String username);
}
