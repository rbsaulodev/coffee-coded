package rb.my_first_web_api.repository;

import org.springframework.stereotype.Repository;
import rb.my_first_web_api.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1,"Saulo", "progresso"));
        usuarios.add(new Usuario(2,"Patrola", "féeboa"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("FIND/id - Recebendo o id: %d para localizar um usuário%n", id);
        return new Usuario(1,"Saulo", "progresso");
    }

    public Usuario findByUsername(String username) {
        System.out.printf("FIND/username - Recebendo o username: %s para localizar um usuário%n", username);
        return new Usuario(2,"Patrola", "féeboa");
    }
}
