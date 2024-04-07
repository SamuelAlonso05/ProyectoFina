public class RealizarPago {
    public double calcularCostoViaje(int distancia, double costoCombustible, double peajes) {

        return distancia * costoCombustible + peajes;
    }

    public void realizarPago(double monto) {

        System.out.println("El pago de $" + monto + " se ha realizado con éxito.");
    }
}
