package rb.my_first_web_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rb.my_first_web_api.model.Usuario;
import rb.my_first_web_api.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;  // Use the correct repository name

    @GetMapping
    public List<Usuario> list() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Usuario user) {
        repository.save(user);
    }

    @PutMapping
    public void update(@RequestBody Usuario user) {
        repository.save(user);
    }

    @GetMapping("/{username}")
    public Usuario find(@PathVariable String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
