public class InicioSesion {
    public InicioSesion(RegistroUsuarios registroUsuarios) {
    }

    public static boolean iniciarSesion(String nombreUsuario, String contrasena) {

        if (nombreUsuario.equals("usuario1") && contrasena.equals("contraseña123")) {
            System.out.println("Inicio de sesión exitoso.");
            return true;
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
            return false;
        }
    }
}
