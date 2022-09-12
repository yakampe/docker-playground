package dev.equalcoding.rest;

import dev.equalcoding.test.TestDao;
import dev.equalcoding.test.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/api")
public class RestController {

    @Autowired
    TestRepository testRepository;

    @GetMapping("test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World!");
    }

    @PostMapping("save")
    public ResponseEntity<TestDao> addNewEntity (@RequestParam String property) {
        TestDao testDao = new TestDao(property);
        TestDao save = testRepository.save(testDao);
        return ResponseEntity.ok(save);
    }

    @GetMapping("get")
    public ResponseEntity<TestDao> getEntity (@RequestParam int id) {
        Optional<TestDao> loaded = testRepository.findById(id);

        return ResponseEntity.ok(loaded.get());
    }

}
