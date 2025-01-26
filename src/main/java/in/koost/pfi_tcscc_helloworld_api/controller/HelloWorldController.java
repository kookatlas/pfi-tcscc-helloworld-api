package in.koost.pfi_tcscc_helloworld_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {



    @GetMapping("/")
    public ResponseEntity<String> greet(){
        return new ResponseEntity<>("Hellow World", HttpStatus.OK);
    }
}
