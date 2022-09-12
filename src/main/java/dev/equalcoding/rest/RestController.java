package dev.equalcoding.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class RestController {

    @GetMapping("test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World!");
    }
}
