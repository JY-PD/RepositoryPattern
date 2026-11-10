package Patrones_De_diseño;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositoryImpl implements UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    
    public void guardar(Usuario usuario) {
        usuarios.add(usuario);
    }

   
    public Usuario buscarPorId(int id) {

        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;
    }

    @Override
    public List<Usuario> listar() {
        return usuarios;
    }
}