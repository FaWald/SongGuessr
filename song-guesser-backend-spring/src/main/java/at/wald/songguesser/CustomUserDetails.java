package at.wald.songguesser;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.Collections;

/**
 * The CustomUserDetails class implements the UserDetails interface to provide custom user details for authentication.
 * It wraps a User entity and provides necessary methods for Spring Security authentication.
 */
public class CustomUserDetails implements UserDetails {


    private User user;

    public CustomUserDetails(User user) {
        super();
        this.user = user;
    }

    /**
     * Gets the authorities granted to the user.
     *
     * @return A collection of granted authorities.
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(user.getRole()));
    }

    /**
     * Gets the password of the user.
     *
     * @return The password of the user.
     */
    @Override
    public String getPassword() {
        return user.getPassword();
    }

    /**
     * Gets the username of the user.
     *
     * @return The username of the user.
     */
    @Override
    public String getUsername() {
        return user.getUsername();
    }

    /**
     * Checks if the user's account is expired.
     *
     * @return True if the account is not expired, false otherwise.
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * Checks if the user's account is locked.
     *
     * @return True if the account is not locked, false otherwise.
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * Checks if the user's credentials are expired.
     *
     * @return True if the credentials are not expired, false otherwise.
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * Checks if the user's account is enabled.
     *
     * @return True if the account is enabled, false otherwise.
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}