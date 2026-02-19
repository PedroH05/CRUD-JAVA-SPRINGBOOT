package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getLogin() == null) {
            throw new CampoObrigatorioException("login");
        }

        if (usuario.getPassword() == null) {
            throw new CampoObrigatorioException("Password");
        }

        if(usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuario na camada de repositorio");
        }else  {
            System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println("DELETE/id - Recebendo o id: %d para excluir um usuario");
        System.out.println(id);
    }

    public  List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Gleyson", "password"));
        usuarios.add(new Usuario("Frank", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("FIND - Recebendo o id: %d para localizar um usuario%n", id);
        return new Usuario("Gleyson", "password");
    }

    public Usuario findByUsername(String username) {
        System.out.printf("FIND/username - Recebendo o username: %s para localizar um usuario%n", username);
        return new Usuario("Gleyson", "password");
    }
}
