import java.util.Scanner;

public class GestionUsuarioss {
    Scanner scanner = new Scanner(System.in);
    Usuario[] usuarios;
    static int contadorUsuarios;

    String usuarioActual;

    public GestionUsuarioss() {
        this.usuarios = new Usuario[50];
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public void registrarUsuario() {
        System.out.println("Por favor, registre un nuevo usuario:");
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();
        Usuario nuevoUsuario = new Usuario(nombreUsuario, correoElectronico, contrasena);
        usuarios[contadorUsuarios] = nuevoUsuario;
        contadorUsuarios++;

        System.out.println("Usuario registrado con éxito.");
    }

    public boolean iniciarSesion() {
        System.out.println("Por favor, inicie sesión:");
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        for(int contador=0;contador<contadorUsuarios;contador++){
                if(nombreUsuario.equals(this.usuarios[contador].getNombreUsuario())){
                    if(contrasena.equals(this.usuarios[contador].getContrasena())){
                        System.out.println("Login Exitoso");
                        this.usuarioActual= nombreUsuario;
                        return true;
                    }
                }
            }
        System.out.println("Login Fallido");

        return false;
    }

    public void mostrarUsuarios (){
        for(int contador=0;contador<contadorUsuarios;contador++){
            System.out.println("Usuario:" + contador +"**********************************************");
            System.out.println("nombreUsuario: " + usuarios[contador].getNombreUsuario());
            System.out.println("correoUsuario: " + usuarios[contador].getCorreoElectronico());
        }
    }

    public void mostrarUsuario(){
        if(this.usuarioActual!=null){
            System.out.println("el usuario actual es: "+ usuarioActual);
        }
        else {
            System.out.println("ninguna sesion iniciada");
        }
    }
}
