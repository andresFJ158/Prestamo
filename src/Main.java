import Controlers.ControllerVenta;
import java.util.Scanner;

public class Main {
    public static ControllerVenta controllerPrestamo;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenido al Simulador de Cajero Automático.");
        controllerPrestamo = new ControllerVenta(scanner);
        controllerPrestamo.crearCuentas();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Nueva venta");
            System.out.println("2. Ver ventas");
            System.out.println("3. Ver clientes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    controllerPrestamo.realizarVenta();
                    break;
                case 2:
                    controllerPrestamo.mostrarVentas();
                    break;
                case 3:
                    controllerPrestamo.mostrarClientes();
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro sistema.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}