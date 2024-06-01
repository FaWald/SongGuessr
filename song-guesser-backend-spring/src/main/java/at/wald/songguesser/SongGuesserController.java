package at.wald.songguesser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/songguesser")
public class SongGuesserController {

    @GetMapping("/home")
    public String admin(){
        return "This is HomePage";
    }
    /*
    @Autowired
    private UserRepository userRepository; // Annahme: Du hast bereits einen UserRepository definiert

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        // Hier kannst du die Logik für das Anlegen eines neuen Benutzers implementieren
        // Zum Beispiel: userRepository.save(user);
        return "User " + user.toString() + " wurde erfolgreich registriert.";
    }


    @PostMapping("/login")
    public String loginUser(@RequestBody LoginRequest loginRequest) {
        // Hier kannst du die Logik für das Einloggen eines Benutzers implementieren
        // Zum Beispiel: userRepository.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        // Annahme: Du hast eine Methode in deinem UserRepository, um einen Benutzer nach Benutzername und Passwort zu suchen
        return "Login erfolgreich für Benutzer: " + loginRequest.getUsername();
    }*/
}

