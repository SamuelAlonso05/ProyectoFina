public class RegistroUsuarios {
    private Usuario[] usuariosRegistrados;
    private int contadorUsuarios;


    public RegistroUsuarios(int i) {
        this.usuariosRegistrados = new Usuario[1];
        this.contadorUsuarios = 1;
    }

    public void registrarUsuario(String nombreUsuario, String correoElectronico, String contrasena) {
        if (contadorUsuarios < usuariosRegistrados.length) {
            Usuario nuevoUsuario = new Usuario(nombreUsuario, correoElectronico, contrasena);
            usuariosRegistrados[contadorUsuarios] = nuevoUsuario;
            contadorUsuarios++;
            System.out.println("Usuario registrado con éxito.");
        } else {
            System.out.println("No se pueden registrar más usuarios, capacidad máxima alcanzada.");
        }
    }
}

