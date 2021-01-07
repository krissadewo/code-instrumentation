package id.co.iconpln.training.listing4;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * @author krissadewo
 * @date 1/4/21 10:11 AM
 */
@Service
public class HelloService {

    private final HelloRepository repository;

    public HelloService(HelloRepository repository) {
        this.repository = repository;
    }

    public Hello save(Hello hello) {
        return repository.save(hello);
    }

    public Collection<Hello> find() {
        return repository.findAll();
    }
}
