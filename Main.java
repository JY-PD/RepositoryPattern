package Patrones_De_diseño;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creando instancia de UsuarioRepositoryImpl...");

        UsuarioRepository repo = new UsuarioRepositoryImpl();

        System.out.println("Guardando usuario: José");

        repo.guardar(
                new Usuario(
                        1,
                        "José",
                        "jose@email.com"
                )
        );

        System.out.println("\nConsultando usuario almacenado...");

        Usuario usuario = repo.buscarPorId(1);

        System.out.println("\nUsuario encontrado:");

        System.out.println(usuario);
    }
}