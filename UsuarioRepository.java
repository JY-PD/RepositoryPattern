package Patrones_De_diseño;

import java.util.List;

public interface UsuarioRepository {

    void guardar(Usuario usuario);

    Usuario buscarPorId(int id);

    List<Usuario> listar();
}