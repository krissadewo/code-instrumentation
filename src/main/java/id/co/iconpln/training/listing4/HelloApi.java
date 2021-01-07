package id.co.iconpln.training.listing4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author krissadewo
 * @date 1/4/21 9:39 AM
 */
@RestController
public class HelloApi {

    private final HelloService service;

    public HelloApi(HelloService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @PostMapping("hellos")
    public ResponseEntity<Hello> save(@RequestBody Hello hello) {
        return new ResponseEntity<>(service.save(hello), HttpStatus.CREATED);
    }

    @GetMapping("hellos")
    public ResponseEntity<Collection<Hello>> find() {
        return new ResponseEntity<>(service.find(), HttpStatus.OK);
    }
}
