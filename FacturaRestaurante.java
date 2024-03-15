import java.util.Scanner;

public class FacturaRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        double descuento = 0;
        if (montoCompra >= 200000) {
            descuento = 0.15 * montoCompra;
        } else if (montoCompra >= 50000) {
            descuento = 0.02 * montoCompra;
        } else if (montoCompra >= 20000) {
            descuento = 0.015 * montoCompra;
        }

        double totalPagar = montoCompra - descuento;

        System.out.println("\n---------------- Factura ----------------");
        System.out.println("Nombre del comprador: " + nombre);
        System.out.println("Monto de la compra: $" + montoCompra);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
        System.out.println("----------------------------------------");
        System.out.println("\n¡Gracias por su compra, " + nombre + "!");
    }
}