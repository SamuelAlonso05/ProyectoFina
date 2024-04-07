import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroUsuarios registroUsuarios = new RegistroUsuarios(10); // Podemos registrar hasta 10 usuarios
        RealizarPago realizarPago = new RealizarPago();

        System.out.println("Bienvenido a la aplicación de compartir coche!");

        // Registro de usuario
        System.out.println("Por favor, registre un nuevo usuario:");
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();
        registroUsuarios.registrarUsuario(nombreUsuario, correoElectronico, contrasena);

        // Iniciar sesión
        System.out.println("Por favor, inicie sesión:");
        System.out.print("Nombre de usuario: ");
        String nombreUsuarioInicioSesion = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasenaInicioSesion = scanner.nextLine();
        InicioSesion iniciarSesion = new InicioSesion(registroUsuarios);
        boolean sesionIniciada = iniciarSesion.iniciarSesion(nombreUsuarioInicioSesion, contrasenaInicioSesion);

        if (sesionIniciada) {
            // Búsqueda de viaje
            System.out.println("Por favor, introduzca el punto de origen:");
            String puntoOrigen = scanner.nextLine();
            System.out.println("Por favor, introduzca el punto de destino:");
            String puntoDestino = scanner.nextLine();
            BucarViaje buscarViaje = new BucarViaje();
            buscarViaje.buscarViajesDisponibles(puntoOrigen, puntoDestino);

            // Publicar viaje
            System.out.println("Por favor, introduzca los detalles del viaje que desea publicar:");
            System.out.print("Alojamiento: ");
            String origenPublicacion = scanner.nextLine();
            System.out.print("Dias de alojamiento: ");
            String destinoPublicacion = scanner.nextLine();
            System.out.print("Fecha del viaje: ");
            String fechaPublicacion = scanner.nextLine();
            System.out.print("Plazas disponibles: ");
            int plazasPublicacion = scanner.nextInt();
            PublicarViaje publicarViaje = new PublicarViaje();

            System.out.println("¡Viaje planeado con éxito!" +  " El dia "   + fechaPublicacion +   " tendrá su coche preparado ");



        }
    }
}