package at.wald.songguesser;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

/**
 * The WebSecurityConfiguration class configures the security settings for the application.
 * It sets up authentication, authorization, and other security-related configurations.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {

    private final UserDetailsService userDetailsService;

    /**
     * Constructs a new {@code WebSecurityConfiguration} with the provided {@link UserDetailsService}.
     * @param userDetailsService the service to load user-specific data
     */
    public WebSecurityConfiguration(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    /**
     * Creates and configures an {@link AuthenticationProvider} bean that uses a {@link DaoAuthenticationProvider}
     * to authenticate users with a {@link UserDetailsService} and a {@link BCryptPasswordEncoder}.
     * @return the configured {@link AuthenticationProvider} bean
     */
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
        return provider;
    }

    /**
     * Configures the security filter chain for the application. Specifies which URL paths are publicly accessible,
     * which require authentication, and which require specific authorities.
     *
     * <p>Configures HTTP Basic Authentication using the default settings.
     *
     * @param http the {@link HttpSecurity} to modify
     * @return the {@link SecurityFilterChain} bean that defines the application's security configuration
     * @throws Exception if an error occurs while configuring the security settings
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/").permitAll()
                                .requestMatchers("/home").permitAll()
                                .requestMatchers("/admin").hasAuthority("ADMIN")
                                .anyRequest().permitAll()
                )
                .httpBasic(Customizer.withDefaults());  // Updated to use the new method

        return http.build();
    }
}
