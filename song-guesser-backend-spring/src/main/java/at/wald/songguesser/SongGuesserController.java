package at.wald.songguesser;

import org.springframework.web.bind.annotation.*;

@RestController

public class SongGuesserController {

    @GetMapping("/home")
    public String home(){
        return "This is HomePage";
    }

    @GetMapping("/admin")
    public String admin(){
        return "This is AdminPage";
    }

}

