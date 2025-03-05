package art.backendservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/example")
public class MainController {


    private final
    @PostMapping("kafka/send")
    public String sendMessage(@RequestBody String message) {

        return "Successfully sent message: " + message;
    }
}
