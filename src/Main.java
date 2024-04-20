import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        menu();
    }



public static void menu() {
    GestionUsuarioss gestionUsuarios = new GestionUsuarioss();
    GestionViajess gestionViajes = new GestionViajess(); // Crear una instancia de GestionViajess

    int respuesta;
    do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicación de compartir coche!");
        System.out.println("Menu:\n 1.Registrar Usuario \n 2.Iniciar Sesión \n 3.Ver Usuarios \n 4.Ver Usuario Actual \n 5.Buscar Viajes Disponibles \n 0.Salir");
        respuesta = sc.nextInt();
        switch (respuesta) {
            case 1:
                gestionUsuarios.registrarUsuario();
                break;
            case 2:
                gestionUsuarios.iniciarSesion();
                break;
            case 3:
                gestionUsuarios.mostrarUsuarios();
                break;
            case 4:
                gestionUsuarios.mostrarUsuario();
                break;

            case 5:
                gestionViajes.buscarViajesDisponibles(); // Llamar a la función buscarViajesDisponibles de GestionViajess
                break;


            case 0:
                System.out.println("Gracias por utilizar nuestro sistema");
        }
    } while (respuesta != 0);
}}
