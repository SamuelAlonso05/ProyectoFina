import java.util.Scanner;

public class GestionViajess {

    Scanner scanner = new Scanner(System.in);


    public void buscarViajesDisponibles() {
            // Búsqueda de viaje
            System.out.println("Por favor, introduzca el punto de origen:");
            String puntoOrigen = scanner.nextLine();
            System.out.println("Por favor, introduzca el punto de destino:");
            String puntoDestino = scanner.nextLine();
            System.out.println(" Buscando viajes disponibles desde: " + puntoOrigen  + " a " + puntoDestino);
            System.out.println("Por favor, introduzca la fecha (DD/MM/AAAA):");
            String fecha = scanner.nextLine();
            System.out.println("Por favor, introduzca el número de plazas disponibles:");
            int plazasDisponibles = scanner.nextInt();
            System.out.println(" ¡Perfecto! el día " + fecha + " tendrá su coche preparado " );
            System.out.println(" Si no desea realizar otra operación, pulse 0 ");

            // Aquí puedes continuar con la lógica de búsqueda de viajes usando los datos ingresados por el usuario
        }

    public void publicarViaje() {
    }
}

